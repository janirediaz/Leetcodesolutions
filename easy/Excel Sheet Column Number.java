public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        int num = 0;
        int count = 0;
        if(s.length() == 0 || s == null){
            return 0;
        }
        for(int i= s.length()-1; i>=0; i--){
            num = s.charAt(i) - 'A' + 1;
            count = (int)Math.pow(26, s.length()-1-i);
            result += num * count;
        }
        return result;
    }
}