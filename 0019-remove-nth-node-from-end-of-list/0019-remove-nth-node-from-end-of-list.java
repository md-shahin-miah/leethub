/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int index) {
        
        if (head.next == null) {
            return null;
        }


        int size = 0;

        ListNode tmpNode = head;

        while (tmpNode != null) {

            tmpNode = tmpNode.next;
            size++;

        }

        if (size == index) {

            return head.next;

        }


        int searchToDelete = size - index;
        ListNode newNode = head;

        int i=1;
        
        while (i < searchToDelete) {

            newNode = newNode.next;
            
            i++;
        }

        newNode.next = newNode.next.next;


        return head;
    }
}