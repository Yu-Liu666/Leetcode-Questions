package VerifyPreorderSequenceinBinarySearchTree;

import java.util.Stack;

public class VerifyPreorderSequenceinBinarySearchTree {

public boolean verifyPreorder(int[] preorder) {
	
		int low=Integer.MIN_VALUE;
		Stack<Integer> stack=new Stack<>();
		for(int p:preorder)
		{
			if(p<low) return false;
			while(!stack.isEmpty()&&p>stack.peek())
				low=stack.pop();
			stack.push(p);		
	    }
		return true;
		
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
