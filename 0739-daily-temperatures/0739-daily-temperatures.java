import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int ans[]=new int[temperatures.length];
        // for(int i=0;i<temperatures.length;i++){
        //     for(int j=i+1;j<temperatures.length;j++){
        //         if(temperatures[i]<temperatures[j]){
        //                ans[i]=j-i;
        //                break;
        //         }
        //     }
        // }
        // return ans;
        Stack<Integer> s=new Stack<>();
        int ans[]=new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!s.isEmpty()&& temperatures[i]>=temperatures[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i]=0;
            }
            else{
                ans[i]=s.peek()-i;
            }
            s.push(i);
        }
        return ans;
    }
}