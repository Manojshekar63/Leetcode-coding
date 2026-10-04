// class Solution {
//     public boolean checkValidString(String s) {
//         Stack<Character> st=new Stack<>();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if(ch==')')
//             {while(!st.isEmpty()&& st.peek()!=')'){
//                 st.pop();
//             }
//             }else{
//                 st.push(ch);
//             }
//         }
//         if(st.size()>0){
//             return false;
//         }
//         return true;
//     }
// }
class Solution {
    public boolean checkValidString(String s) {

        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                openStack.push(i);
            }
            else if (ch == '*') {
                starStack.push(i);
            }
            else { // ')'

                if (!openStack.isEmpty()) {
                    openStack.pop();
                }
                else if (!starStack.isEmpty()) {
                    starStack.pop();
                }
                else {
                    return false;
                }
            }
        }

        // Match remaining '(' with later '*'
        while (!openStack.isEmpty() && !starStack.isEmpty()) {

            int openIndex = openStack.pop();
            int starIndex = starStack.pop();

            if (openIndex > starIndex) {
                return false;
            }
        }

        return openStack.isEmpty();
    }
}