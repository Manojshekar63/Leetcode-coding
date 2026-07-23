class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //long count=0,ans=0;
        // for(int n:nums){
        //     if(n==0){
        //         count++;
        //         ans+=count;
        //     }else{
        //         count=0;
        //     }
        // }
        // return ans;
        long left=0, ans=0;
        for(int right=0;right<nums.length;right++){
              if(nums[right]!=0){
                left=right+1;
              }
              else{
                ans+=(right-left+1);
              }
        }
        return ans;
    }
}