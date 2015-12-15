Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

    public class Solution {
    public String convertToTitle(int n) {
        String answer = "";
        int rest;

        while (n > 0) {
            rest = n % 26;
            n = n / 26;
            if (rest == 0) {
                rest = 26;
                n = n - 1;
            }
            answer = (char)(rest - 1 + 'A') + answer;
        }

        return answer;
    }
}