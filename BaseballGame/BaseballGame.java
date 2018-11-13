package BaseballGame;

import java.util.Stack;

public class BaseballGame {

	 public int calPoints(String[] ops) {
		 
		 Stack<Integer> stack=new Stack<>();
		 int sum=0;
		 for(String s:ops)
		 {
			 if(s.equals("C"))
			 {
				 if(stack.isEmpty()) continue;
				 else {
					 sum-=stack.pop();
				 }
			 }
			 else if(s.equals("D"))
			 {
				 if(stack.isEmpty()) continue;
				 else {
					 int x1=stack.peek();
					 stack.push(x1*2);
					 sum+=x1*2;
				 }
			 }
			 else if(s.equals("+"))
			 {
				 if(stack.size()>=2) {
					 int x1=stack.pop();
					 int x2=stack.pop();
					 stack.push(x2);
					 stack.push(x1);
					 stack.push(x1+x2);
					 sum+=x1+x2;
				 }
			 }
			 else {
				 stack.push(Integer.parseInt(s));
				 sum+=Integer.parseInt(s);
			 }
		 }
		 return sum;
     }
}
