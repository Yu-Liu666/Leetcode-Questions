package RemoveNthNodeFromEndofList;

public class Improve {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy=new ListNode(1);
		dummy.next=head;
		ListNode slow=dummy, fast=dummy;
		while(fast.next!=null)
		{
			if(n<=0) slow=slow.next;
			fast=fast.next;
			n--;
		}
		if(slow.next!=null) slow.next=slow.next.next;
		return dummy.next;
	}
}
