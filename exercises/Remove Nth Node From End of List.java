/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        while(first != null && n > 0) {
            first = first.next;
            n--;
        }

        if (first == null) {
            return head.next;
        }

        first = first.next;
        ListNode second = head;
        while(first != null) {
            first = first.next;
            second = second.next;
        }

        ListNode list = second.next.next;
        second.next = list;

         return head;
    }
}