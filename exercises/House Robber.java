public class Solution {
    public int rob(int[] nums) {
        int rob = 0;
        int cantRob = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = cantRob;
            cantRob = Math.max(rob, cantRob);
            rob = temp + nums[i];
        }
        return Math.max(rob, cantRob);
    }
}