class Solution {
    public String strWithout3a3b(int a, int b) {
        StringBuilder str=new StringBuilder();
        while(a>0 ||  b>0){
            if(a>b){
                if(a>1){
                    str.append("aa");
                    a-=2;
                }else{
                    str.append("a");
                    a--;
                }
                if(b>0){
                    str.append("b");
                    b--;
                }
            }
            else if(b>a){
                if(b>1){
                    str.append("bb");
                    b-=2;
                }else{
                    str.append("b");
                    b--;
                }
                if(a>0){
                    str.append("a");
                    a--;
                }
            }
            else{
                str.append("ab");
                a--;
                b--;
            }
        }
        return str.toString();
    }
}