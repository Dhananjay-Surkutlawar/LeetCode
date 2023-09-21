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
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head.next==null)
        return null;
        if(head==null || head.next==null) return head;

        ListNode fast=head;
        ListNode slow=head;
        ListNode prevslow=null;

        while(fast!=null && fast.next!=null)
        {
            prevslow=slow;
            slow=slow.next;
            fast=fast.next.next;

        }

        prevslow.next=prevslow.next.next;

        return head;
        

        // if(head==null || head.next==null)
        // return head;

        // ListNode temp=head;
        // int size=0;
        // while(temp!=null)
        // {
        //     size++;
        //     temp=temp.next;
        // }
        // if(size == 1)
        // {
        //     return null;
        // }
        // if(size==2)
        // {
        //     head.next=null;
        //     return head;
        // }
        // int mid=size/2;
        // ListNode temp2=head;
        // for(int i=1;i<mid;i++)
        // {
        //     temp2=temp2.next;
        // }

        // temp2.next=temp2.next.next;


        // return head;


        
    }
}