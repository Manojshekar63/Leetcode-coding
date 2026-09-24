import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        // Step 1: Sort in descending order
        Arrays.sort(nums);
        
        // Step 2: Remove duplicates by traversing backwards
        List<Integer> distinct = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (distinct.isEmpty() || distinct.get(distinct.size() - 1) != nums[i]) {
                distinct.add(nums[i]);
            }
        }
        
        // Step 3: Return result
        if (distinct.size() >= 3) {
            return distinct.get(2); // 3rd maximum
        } else {
            return distinct.get(0); // maximum
        }
    }
}
