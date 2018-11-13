package ReorderList;

import java.util.Stack;

public class ReorderList {

public void reorderList(ListNode head) {
     
	 ListNode slow=head,fast=head;
     while(fast!=null&&fast!=null)
     {
    	 slow=slow.next;
    	 fast=fast.next.next;
     }
     
     ListNode temp1=slow.next,temp2=null;
     slow.next=null;
     while(temp1!=null)
     {
    	 temp2=temp1.next;
    	 temp1.next=slow;
    	 slow=temp1;
    	 temp1=temp2;
     }
     
     fast=head;
     while(slow!=null&&fast!=null)
     {
    	 if(slow.next==fast) break;
    	 ListNode nextSlow=slow.next;
    	 ListNode nextFast=fast.next;
    	 slow.next=fast;
    	 fast.next=nextSlow;
    	 slow=nextSlow;
    	 fast=nextFast;
     } 
}
}
