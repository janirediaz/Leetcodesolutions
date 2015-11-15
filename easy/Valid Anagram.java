public class Solution {
    public boolean isAnagram(String s, String t) {
        char [] a =s.toCharArray();
        char [] b =t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

    if(String.valueOf(a).equals(String.valueOf(b))){
    	return true;
    }else{
        return false;
    }
}