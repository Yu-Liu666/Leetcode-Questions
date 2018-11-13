package RemoveNthNodeFromEndofList;

public class RemoveNthNodeFromEndofList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		int len=0;
		ListNode temp=head;
		while(temp!=null) {
			len++;
			temp=temp.next;
		}
		int index=len-n;
		if(index==0) return head.next;
		int count=1;
		temp=head;
		while(temp!=null)
		{
			count++;
			if(count==index)
			{
				temp.next=temp.next.next;
				break;
			}
			temp=temp.next;
		}
		return head;
    }
}
