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
 public int pairSum(ListNode head) {
    int ans = 0;
    ListNode right = head;
    ListNode tempTwoShift = head;

    while (tempTwoShift != null && tempTwoShift.next != null) {
      right = right.next;
      tempTwoShift = tempTwoShift.next.next;
    }

    ListNode tail = reverseList(right);

    while (tail != null) {
      ans = Math.max(ans, head.val + tail.val);
      head = head.next;
      tail = tail.next;
    }

    return ans;
  }

  private ListNode reverseList(ListNode head) {
    ListNode prev = head;
      ListNode curr = head.next;
    while (curr != null) {
      ListNode newNode = curr.next;
      curr.next = prev;
      prev = curr;
      curr = newNode;
       
    }
     
      head.next=null;
      head=prev;
      
    return head;
  }
}