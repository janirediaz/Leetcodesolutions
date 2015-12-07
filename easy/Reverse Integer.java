Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321 

public class Solution {
    public int reverse(int x) { 
        int result = 0;
        while (x != 0) {
            if (result * 10 / 10 != result){
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}