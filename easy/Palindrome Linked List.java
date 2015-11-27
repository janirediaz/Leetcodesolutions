/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List newList = new ArrayList();

        for(ListNode p=head ; p!=null ; p=p.next){
            newList.add(p.val);
        }

        int len = newList.size();
        for(int i=0 ; i<len/2 ; i++){
            if((int)newList.get(i) != (int)newList.get( (len-1)-i )){
                return false;
            }
        }
        return true ;
    }
}