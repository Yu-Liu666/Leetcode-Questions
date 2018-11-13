package OddEvenLinkedList;

public class OddEvenLinkedList {

	public ListNode oddEvenList(ListNode head) {
		if(head==null) return head;
		ListNode odd=head;
		ListNode even=odd.next;
		ListNode temp1=odd;
		ListNode temp2=even;
		while(temp1.next!=null||temp2.next!=null)
		{
			if(temp1.next!=null)
			{
				temp1.next=temp1.next.next;
				temp1=temp1.next;
			}
			if(temp2!=null)
			{
				temp2.next=temp2.next.next;
				temp2=temp2.next;
			}
		}
		odd.next=even;
		return odd;
    }

}
