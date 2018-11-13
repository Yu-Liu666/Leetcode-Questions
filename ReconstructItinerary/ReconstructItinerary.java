package ReconstructItinerary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ReconstructItinerary {

public List<String> findItinerary(String[][] tickets) {
	List<String> list=new ArrayList<>();
	HashMap<String,ArrayList<String>> graph=new HashMap<>();
	int count=0;
    for(String[] arr:tickets) {
   	 	if(!graph.containsKey(arr[0])) graph.put(arr[0],new ArrayList<>());
   	 	graph.get(arr[0]).add(arr[1]);
   	 	count++;
    }
    
    }
boolean dfs(HashMap<String,ArrayList<String>> graph, String s, List<String> list,int c,int count) {
	if(c==count) {
		
	}
	for(int i=0;i<graph.get(s).size();i++)
	{
		
	}
}
}
