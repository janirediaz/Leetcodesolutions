public class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean duplicates = false;
        if(nums.length >= 1){
            Arrays.sort(nums);
            for(int i = 1; i<nums.length; i++){
                if(nums[i-1] == nums[i]){
                    duplicates = true;
                    break;
                }
            }
        }
        return duplicates;
    }
}