class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cle=new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                cle.append(Character.toLowerCase(c));
            }
        }
        int n=cle.length();
        for(int i=0;i<n/2;i++){
            if(cle.charAt(i)!=cle.charAt(n-i-1)){
                return false;
            }
                    }return true;

        
        
    }

}