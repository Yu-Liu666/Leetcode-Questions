package FindEventualSafeStates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindEventualSafeStates {

public List<Integer> eventualSafeNodes(int[][] graph) {
	List<Integer> list=new ArrayList<>();
    int[] flag=new int[graph.length];
    for(int i=0;i<graph.length;i++)
   	 if(dfs(i,flag,graph)) list.add(i);
    return list;
}

boolean dfs(int n,int[] flag,int[][] graph)
{
	if(flag[n]==1) return true;
	if(flag[n]==-1) return false;
	flag[n]=-1;
	for(int i=0;i<graph[n].length;i++)
		if(!dfs(graph[n][i],flag,graph))
			return false;
	flag[n]=1;
	return true;
}
}
