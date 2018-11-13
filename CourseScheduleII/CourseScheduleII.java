package CourseScheduleII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class CourseScheduleII {

	 public int[] findOrder(int numCourses, int[][] prerequisites) {
	     HashMap<Integer,ArrayList<Integer>> graph=new HashMap<>();
	     int[] ans=new int[numCourses];
	     Stack<Integer> stack=new Stack<>();
	     for(int[] pre: prerequisites) {
	    	 if(!graph.containsKey(pre[0]))
	    		 graph.put(pre[0],new ArrayList<Integer>());
	    	 graph.get(pre[0]).add(pre[1]);
	     }
	     int[] flag=new int[numCourses];
	     for(int i=0;i<numCourses;i++)
	     {
	    	 if(flag[i]==1) continue;
	    	 if(!dfs(i,flag,graph,stack)) return new int[] {};
	     }
	     int i=ans.length-1;
	     while(i>=0&&!stack.isEmpty())
         { 	 
             int t=stack.pop();
   //          System.out.println(t);
             ans[i--]=t;
         }
	     return ans;
	}

	boolean dfs(int n,int[] flag,HashMap<Integer,ArrayList<Integer>> graph,Stack<Integer> stack)
	{
        System.out.println(n);
        if(flag[n]==1) return true;
		if(flag[n]==-1) return false;
		if(!graph.containsKey(n)) {flag[n]=1;stack.push(n);return true;}
		flag[n]=-1;
		for(int i=0;i<graph.get(n).size();i++)
			if(!dfs(graph.get(n).get(i),flag,graph,stack))
				return false;
		flag[n]=1;
		stack.push(n);
		return true;
	}
}
