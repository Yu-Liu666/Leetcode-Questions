package RemoveDuplicatesfromSortedListII;

public class RemoveDuplicatesfromSortedListII {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummy=new ListNode(0),temp=head,ans=dummy;
		
		while(temp!=null)
		{
			if(temp.next!=null&&temp.val==temp.next.val)
			{
				while(temp!=null&&temp.next!=null&&temp.val==temp.next.val)
					temp=temp.next;
				temp=temp.next;
			}
			else
			{	dummy.next=temp;
				dummy=temp;
				temp=temp.next;
			}
		}
		return ans.next;
    }
}
