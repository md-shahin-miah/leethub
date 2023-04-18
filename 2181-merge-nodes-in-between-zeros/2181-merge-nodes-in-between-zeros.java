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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode result =new ListNode();
        
        ListNode tempNode=result;
        
        ListNode listNodeTemp=head;

        int countZero=0;
        int sum=0;

        while (listNodeTemp!=null){

            if (listNodeTemp.val==0){
                countZero++;
            }
            else {
                sum+=listNodeTemp.val;

            }

            if (countZero==2){
                ListNode nodeNew=new ListNode(sum);

                result.next=nodeNew;
                result=result.next;
            
                sum=0;
                countZero=1;

            }
            listNodeTemp=listNodeTemp.next;


        }
        
        return tempNode.next;

    }
}