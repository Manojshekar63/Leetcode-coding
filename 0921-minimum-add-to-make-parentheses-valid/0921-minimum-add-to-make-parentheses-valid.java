class Solution {
    public int minAddToMakeValid(String s) {
        int balance = 0;   // unmatched '('
        int extraClose = 0; // unmatched ')'

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else { // ch == ')'
                if (balance > 0) {
                    balance--; // match with '('
                } else {
                    extraClose++; // need an extra '('
                }
            }
        }
        return balance + extraClose;
    }
}
