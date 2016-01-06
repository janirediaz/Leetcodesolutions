public class Solution {
    public boolean isHappy(int n) {
       int result = 0;
        while (n > 9) {
            result += Math.pow(n % 10, 2);
            n = n / 10;
        }
        result += Math.pow(n, 2);
        if (result > 9){
            return isHappy(result);
        }
        if (result == 1) {
            return true;
        } else {
            return false;
        } 
    }
}