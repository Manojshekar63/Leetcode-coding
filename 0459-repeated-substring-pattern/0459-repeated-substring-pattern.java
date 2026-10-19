
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int len = 1; len <= n / 2; len++) {
            // The block must fit an exact number of times
            if (n % len != 0) {
                continue;
            }

            String pattern = s.substring(0, len);
            boolean matches = true;

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != pattern.charAt(i % len)) {
                    matches = false;
                    break;
                }
            }

            if (matches) {
                return true;
            }
        }

        return false;
    }
}
