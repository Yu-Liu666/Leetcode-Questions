package SplitLinkedListinParts;

public class SplitLinkedListinParts {

	public ListNode[] splitListToParts(ListNode root, int k) {
		ListNode[] ans=new ListNode[k];
		int len=0;
		ListNode temp=root;
		while(temp!=null) { 
			len++;
			temp=temp.next;
		}
		int remain=len/k;
		int plus=len%k;
		for(int i=0;i<ans.length;i++) {
			int num=remain;
			if(plus>0) {num++;plus--;}
			if(root==null) break;
			ListNode x=null;
			ans[i]=root;
			while(root!=null&&num!=0)
			{
				if(num==1) x=root;
				num--;
				root=root.next;
			}
			if(x!=null) x.next=null;
		}
		return ans;
    }
}
