public class Solution {
    public int removeElement(int[] nums, int val) {
        int rem = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] == val){
                rem++;
            }else{
                nums[i-rem] = nums[i]; 
            }
        }
        return len - rem;
    }
}