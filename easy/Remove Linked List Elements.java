/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode current = head;
        ListNode head2 = head;
        while(current!=null) {
            if(current.val==val && prev==null) {
                head2 = current.next;
                current = current.next;
            }else if(current.val==val) {
                prev.next = current.next;
                current = current.next;
            }else {
                prev = current;
                current = current.next;
            }
        }
        return head2;
    }
}