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
    public ListNode addTwoNumbers(ListNode listNode, ListNode listNode2) {
             ListNode result = new ListNode();
        ListNode temp = result;


        int carry=0;
        while (listNode != null || listNode2 != null||carry>0) {

            int sum = 0;

            if (listNode2 != null) {
                sum += listNode2.val;
                listNode2 = listNode2.next;
            }


            if (listNode != null) {
                sum += listNode.val;
                listNode = listNode.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode newNode=new ListNode(sum%10);
            
            temp.next=newNode;
            temp=temp.next;

        }

        return result.next;
    }
}