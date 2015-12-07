 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome. 

public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0 || s.length() == 1){
            return true;
        }
        
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        
        while(left < right){
            
        }

        return true;
    }
}