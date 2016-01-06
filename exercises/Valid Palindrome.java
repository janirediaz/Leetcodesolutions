 Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome. 

public class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0 || s.length() == 1){
            return true;
        }
        
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < s.length()-1 && j >= i){
            if (!isValidPalindrome(s.charAt(i))){
                i++;
                continue;
            }
            if (!isValidPalindrome(s.charAt(j))){
                j--;
                continue;
            }
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isValidPalindrome(char c){
        return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

}
