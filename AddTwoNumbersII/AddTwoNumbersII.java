package AddTwoNumbersII;

public class AddTwoNumbersII {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode r1=reverse(l1,null);
		ListNode r2=reverse(l2,null);
		
		int temp=0;
		ListNode pre=null;
		while(r1!=null||r2!=null)
		{
			int first=r1==null?0:r1.val;
			int second=r2==null?0:r2.val;
			ListNode node=new ListNode((temp+first+second)%10);
			node.next=pre;
			pre=node;
			temp=(temp+first+second)/10;
		}
		if(temp!=0) { ListNode node=new ListNode(temp);
					node.next=pre;
					pre=node;}
		return pre;
    }
	
	ListNode reverse(ListNode root,ListNode newHead) {
		ListNode next=root.next;
		root.next=newHead;
		return reverse(next,root);
	}
}
