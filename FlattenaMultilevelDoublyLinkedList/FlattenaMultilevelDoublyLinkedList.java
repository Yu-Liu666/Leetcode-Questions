package FlattenaMultilevelDoublyLinkedList;

public class FlattenaMultilevelDoublyLinkedList {

	 public Node flatten(Node head) {
	        return dfs(head);
	    }
	 
	 Node dfs(Node node) {
		 if(node==null) return null;
		 Node next=node.next;
		 if(node.child!=null)
		{ 
			 Node temp=node;
			 node.next=dfs(node.child);
			 node.child.prev=node;
			 node.child=null;
		 	  while(temp.next!=null) {
		 		  temp=temp.next;
		 	  }
		 	 Node x=dfs(next);
			 temp.next=x;
			 x.prev=temp;
		}
		 else node.next=dfs(node.next);
		 return node;
	 }
}
