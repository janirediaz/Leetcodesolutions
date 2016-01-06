public class Solution {
  public int trailingZeroes(int n){
       int counter  = 0;
       while(n > 1){
           counter += n / 5;
           n = n / 5;
       }

       return counter;
    }
}