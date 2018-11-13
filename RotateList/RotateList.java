package RotateList;

public class RotateList {

public ListNode rotateRight(ListNode head, int k) {
     ListNode fast=head,slow=head,dummy=new ListNode(1);
     dummy.next=head;
     fast=dummy;slow=dummy;
     int len=0;
     while(fast.next!=null) {
    	 len++;
    	 fast=fast.next;
     }
     int i=len-k%len;
     while(i!=0)
     {
    	 slow=slow.next;
    	 i--;
     }
     
     fast.next=dummy;
     dummy.next=slow.next;
     slow.next=null;
     return dummy.next;
    }
}
