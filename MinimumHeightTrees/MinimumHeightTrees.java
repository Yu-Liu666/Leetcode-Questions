package MinimumHeightTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimumHeightTrees {

public List<Integer> findMinHeightTrees(int n, int[][] edges) {
	   if(n==1) return Arrays.asList(0);
	   List<Integer> leaves=new ArrayList<>();
	  	List<HashSet<Integer>> graph=new ArrayList<>();
	  	for(int i=0;i<n;i++)
	  		graph.add(new HashSet<Integer>());
	  	for(int i=0;i<edges.length;i++)
	  	{
	  		graph.get(edges[i][0]).add(edges[i][1]);
	  		graph.get(edges[i][1]).add(edges[i][0]);
	  	}
	  	for(int i=0;i<graph.size();i++)
	  		if(graph.get(i).size()==1)
	  			leaves.add(i);

	  	while(n>2)
	  	{
	  		n-=leaves.size();
	  		List<Integer> newLeaves=new ArrayList<>();
	  		for(int i=0;i<leaves.size();i++)
	  		{
	  			int j=graph.get(leaves.get(i)).iterator().next();
	  			graph.get(j).remove(leaves.get(i));
	  			if(graph.get(j).size()==1) newLeaves.add(j);
	  		}
	  		leaves=newLeaves;
	  	}
	  	return leaves;
  }
}
