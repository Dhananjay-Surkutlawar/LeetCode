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
    public ListNode reverseList(ListNode head)
    {
            ListNode curr=head;
            ListNode pre=null;
            ListNode next=null;


            while(curr!=null)
            {
                next=curr.next; // 2 3 4
                curr.next=pre; // 3->2->1->null
                pre=curr; // 2
                curr=next;// 3

            }

            return pre;
        
    }
}