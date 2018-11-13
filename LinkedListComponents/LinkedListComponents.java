package LinkedListComponents;

import java.util.HashSet;

public class LinkedListComponents {

	public int numComponents(ListNode head, int[] G) {
		
		HashSet<Integer> set=new HashSet<>();
		HashSet<Integer> group=new HashSet<>();
		for(int n:G) set.add(n);
		int i=0;
		while(head!=null)
		{
			if(group.contains(i-1)&&set.contains(head.val))
				group.remove(i-1);
			if(set.contains(head.val))
			  group.add(i);
			i++;
			head=head.next;
		}
		return group.size();
    }
}
