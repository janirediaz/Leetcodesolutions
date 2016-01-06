Rotate Array

Rotate an array of n elements to the right by k steps.

For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 

public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (nums.length < 2) {
            return;
        }
        k = nums.length - k;
        int[] temp = new int[k];
        for (int i = 0 ; i < k ; i++ ) {
            temp[i] = nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            nums[i -k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[nums.length -k + i] = temp[i];
        }
    
    }
}