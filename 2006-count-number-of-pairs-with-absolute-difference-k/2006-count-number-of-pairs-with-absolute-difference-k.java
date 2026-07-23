import java.util.*;
class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer,Integer> set =new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            set.put(nums[i],set.getOrDefault(nums[i],0)+1);

        }
        for(int n: set.keySet()){
            if(set.containsKey(n+k)){
                count+=set.get(n)*set.get(n+k);
            }
        }
        return count;
    }
}