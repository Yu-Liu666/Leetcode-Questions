package PartitionList;

public class PartitionList {

	public ListNode partition(ListNode head, int x) {
		
		ListNode dummy1=new ListNode(0), temp1=dummy1;
		ListNode dummy2=new ListNode(0), temp2=dummy2;
		while(head!=null)
		{
			if(head.val>=x)
			{
				dummy2.next=head;
				dummy2=head;
			}
			else 
			{
				dummy1.next=head;
				dummy1=head;
			}
		head=head.next;
		}
		dummy2.next=null;
		dummy1.next=temp2.next;
		return temp1.next;
    }
	
}
