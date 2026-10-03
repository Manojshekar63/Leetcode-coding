class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doub=s+s;
        String st=doub.substring(1, doub.length()-1);
        return st.contains(s);
         
    }
}