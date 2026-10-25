class Solution {
    public boolean isValid(String s) {
        // int count=0;
        // for(char ch: s.toCharArray()){
        //     if(ch=='(' ||ch=='{'||ch=='[')
        //     {
        //         count++;
        //     }
        //     else if(ch==']'&& ch-1=='[' ||ch=='}'&& ch-1=='{'||ch==')'&& ch-1=='(')
        //     {
        //         count--;
        //     }
        // }
        // if(count==0){
        //     return true;
        // }
        // return false;

        if(s.length()==1){
            return false;
        }

        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);

            }else if(st.isEmpty()){
                return false;
            }
            else if(ch==')' && st.peek()=='('||ch=='}' && st.peek()=='{' ||ch==']' && st.peek()=='['){
                st.pop();
            }else{
                return false;
            }
        }

        if(st.size()==0){
            return true;
        }

        return false;
    }
}