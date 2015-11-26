public class Solution {
    public String countAndSay(int n) {
        if(n == 0){ 
            return null;
        }
        if(n == 1){
            return "1";
        }
        String s = "1";
        for(int i = 2; i <= n; i ++){
            String current = "";
            int j = 0;
            int count = 1;
            while(j < s.length() - 1){
                if(s.charAt(j + 1) == s.charAt(j)){
                    count ++;
                }else{
                    current += String.valueOf(count) + s.charAt(j);
                    count = 1;
                }
                j ++;
            }
            current += String.valueOf(count) + s.charAt(j);
            s = current;
        }
        return s;
    }
}