package AsteroidCollision;

import java.util.Stack;

public class AsteroidCollision {

public int[] asteroidCollision(int[] asteroids) {
     Stack<Integer> stack=new Stack<>();
     for(int a:asteroids)
     {
    	 if(a<0)
    	 {
    		 while(!stack.isEmpty())
    		 {
    			 if(stack.peek()<0) {stack.push(a);break;}
    			 else if(stack.peek()==Math.abs(a)) {stack.pop();break;}
    			 else if(stack.peek()<Math.abs(a)) {stack.pop();if(stack.isEmpty()) stack.push(a);}
    			 else if(stack.peek()>Math.abs(a)) break;
    		 }
    	 }
    	 else
    		 stack.push(a);
     }
     int[] ans=new int[stack.size()] ;
     int i=0;
     while(!stack.isEmpty())
    	 ans[i++]=stack.pop();
     return ans;  
    }
}
