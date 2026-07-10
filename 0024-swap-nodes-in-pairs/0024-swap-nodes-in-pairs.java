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
class Solution
 {
    public ListNode swapPairs(ListNode head)
     {
       //if there is only 0 or 1 elelemnt thn return list as it is
       if( head==null ||head.next==null )
       return head;

       ListNode dummy=new ListNode(0);
       dummy.next=head ;// dummy point to head
       ListNode prev=dummy;

       while(prev.next!=null && prev.next.next!=null)
       {
            ListNode first=prev.next;
            ListNode second=first.next;

            /* now swappig logic
             1-->3, 2--->1 dummy-->2 prev=1;
             */
             first.next=second.next;//1-->3
             second.next=first;//2--->1
             prev.next=second; // dummy-->2

             prev=first;// prev(1)
       }
       return dummy.next;
    }
}
/*
        if (head==null || head.next==null)
        {
            return head;
        }
        

        //we will take one dummy node
        ListNode dummy= new ListNode(0);

        dummy.next=head;

        ListNode prev=dummy;
        while(prev.next!=null && prev.next.next!=null)
        {
            ListNode first=prev.next;
            ListNode second= first.next;

            //now swapping
           
            first.next=second.next;  // 1--3
            second.next=first; // 2-->1
            prev.next=second ;// dummy-->2
            //after this 3 step list will be dummy -->2-->1-->3
            prev=first;  // dummy -->2-->(prev)1-->3

         }

        return dummy.next; */