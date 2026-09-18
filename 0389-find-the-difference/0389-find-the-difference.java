class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<>();

        // Count frequencies in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract frequencies using t
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return c; // new character
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return c; // extra occurrence
            }
        }
        return ' '; 
    }
}