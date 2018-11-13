package LinkedListComponents;

import java.util.HashSet;

public class Improve {

	public int numComponents(ListNode head, int[] G) {
		HashSet<Integer> set=new HashSet<>();
		for(int n:G) set.add(n);
		int res=0;
		while(head!=null)
		{
			if(set.contains(head.val)&&(head.next==null||!set.contains(head.next.val))) res++;
			head=head.next;
		}
		return res;
	}
}
