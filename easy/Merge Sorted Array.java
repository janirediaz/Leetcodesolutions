public class Solution{
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int num1Tail = m - 1;
        int num2Tail = n - 1;
        int newTail = m + n - 1;

        while(num2Tail >= 0) {
            if(num1Tail >= 0 && nums1[num1Tail] > nums2[num2Tail]) {
                nums1[newTail] = nums1[num1Tail];
                num1Tail--;
            }else {
                nums1[newTail] = nums2[num2Tail];
                num2Tail--;
            }
            newTail--;
        }
    }
}