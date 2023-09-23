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
    public int pairSum(ListNode head) 
    {
        ListNode mid=head;
        ListNode last=head.next;

        while(last!=null && last.next!=null && last.next.next!=null) 
        {
            mid=mid.next;
            last=last.next.next;
        }
        ListNode curr=mid.next;
        ListNode prev=null;
        ListNode node=null;

        while(curr!=null)
        {
            node=curr.next;
            curr.next=prev;
            prev=curr;
            curr=node;
        }
        ListNode temp=head;
        int max=0;

        while(temp!=null && last!=null)
        {
            max=Math.max(max,temp.val+last.val);
            last=last.next;
            temp=temp.next;
        }

        return max;
        
    }
}