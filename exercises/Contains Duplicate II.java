public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null){
            return false;
        }
        Map<Integer,Integer> check = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i ++){
            if(check.containsKey(nums[i])){
                if( i - check.get(nums[i]) <= k){
                    return true;
                }
            }
            check.put(nums[i], i);
        }
        return false;
    }
}