package CourseSchedule;

import java.util.ArrayList;
import java.util.HashMap;

public class CourseSchedule {

public boolean canFinish(int numCourses, int[][] prerequisites) {
     HashMap<Integer,ArrayList<Integer>> graph=new HashMap<>();
     for(int[] pre: prerequisites) {
    	 if(!graph.containsKey(pre[0]))
    		 graph.put(pre[0],new ArrayList<Integer>());
    	 graph.get(pre[0]).add(pre[1]);
     }
     int[] flag=new int[numCourses];
     for(int i=0;i<numCourses;i++)
     {
    	 if(flag[i]==1) continue;
    	 if(!dfs(i,flag,graph)) return false;
     }
     return true;
}

boolean dfs(int n,int[] flag,HashMap<Integer,ArrayList<Integer>> graph)
{
	if(flag[n]==-1) return false;
	if(!graph.containsKey(n)) return true;
	flag[n]=-1;
	for(int i=0;i<graph.get(n).size();i++)
		if(!dfs(graph.get(n).get(i),flag,graph))
			return false;
	flag[n]=1;
	return true;
}

}
