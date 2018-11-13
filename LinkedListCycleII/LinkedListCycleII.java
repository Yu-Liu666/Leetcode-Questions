package LinkedListCycleII;

public class LinkedListCycleII {

public ListNode detectCycle(ListNode head) {
    
	ListNode fast=head,slow=head;
	while(fast!=null&&fast.next!=null)
	{
		slow=slow.next;
		fast=fast.next.next;
		{
			if(slow==fast)
			{
				slow=head;
				while(slow!=fast)
				{
					slow=slow.next;
					fast=fast.next;
				}
				return slow;
			}
		}
	}
	return null;
    }
}
