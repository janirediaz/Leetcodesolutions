Description:

Count the number of prime numbers less than a non-negative number, n.

public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] num = new boolean[n];
        for(int i = 2; i < n; i++) {
            if(!num[i]) {
                count++;
                for(int j = 2 * i; j < n; j += i)
                    num[j] = true;
            }
        }
        return count;
    }
}