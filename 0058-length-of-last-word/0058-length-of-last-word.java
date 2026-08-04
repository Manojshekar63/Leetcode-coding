import java.util.*;
class Solution {
    public int lengthOfLastWord(String s) {
        String st=s.trim();
        int c=0;
        for(int i=st.length()-1;i>=0;i--){
            if(st.charAt(i)!=' '){
                c++;
            }
            else{
                break;
            }
        }
        return c;
        
    }
}