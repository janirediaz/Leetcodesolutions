public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null||strs.length==0){ 
            return "";
        }
        int n = strs[0].length();
        String result = "";
        for(int i =0; i<strs.length;i++){
            if(strs[i].length()<n){
                n= strs[i].length();
            }
        }
        for (int i = 0; i<n;i++){
            char temp = strs[0].charAt(i);

            for (int j = 0; j<strs.length; j++){
                if(temp!= strs[j].charAt(i)){
                    return result;
                }

            }
            result+=temp;
        }
        return result;
    }
}