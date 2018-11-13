package SwapNodesinPairs;

public class SwapNodesinPairs {

	public ListNode swapPairs(ListNode head) {
		  if(head==null||head.next==null) return head;
          ListNode i=head;
			ListNode ans=head.next,j=head.next;
			ListNode temp=head;
			while(i!=null&&j!=null)
			{
				ListNode x=j.next;
				j.next=i;
				if(i!=head)
				temp.next=j;
				temp=i;
				i=x;
				if(x!=null)
				j=x.next;
			}
			if(i==null||j==null) temp.next=i;
			return ans;
    }
}
