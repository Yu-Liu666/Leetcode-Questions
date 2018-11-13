package AddTwoNumbersII;

import java.util.Stack;

public class Improve {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<ListNode> r1=new Stack<>();
		Stack<ListNode> r2=new Stack<>();
		while(l1!=null) {r1.push(l1); l1=l1.next;}
		while(l2!=null) {r2.push(l2); l2=l2.next;}
		
		int temp=0;
		ListNode pre=null;
		while(!r1.isEmpty()||!r2.isEmpty())
		{
			int first=r1.isEmpty()?0:r1.pop().val;
			int second=r2.isEmpty()?0:r2.pop().val;
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
}
