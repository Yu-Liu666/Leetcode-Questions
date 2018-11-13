package SwapNodesinPairs;

public class Recusive {
	
	public ListNode swapPairs(ListNode head) {
		if(head==null||head.next==null) 
			return head;
		ListNode temp=head.next;
		head.next=swapPairs(head.next.next);
		temp.next=head;
		return temp;
	}

}
