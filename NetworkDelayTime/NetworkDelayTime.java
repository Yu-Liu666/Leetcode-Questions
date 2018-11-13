package NetworkDelayTime;

import java.util.HashMap;

public class NetworkDelayTime {

int count=0;
public int networkDelayTime(int[][] times, int N, int K) {
     boolean[] flag=new boolean[N+1];
     HashMap<Integer,HashMap<Integer,Integer>> graph=new HashMap<>();
     for(int[] arr:times) {
    	 if(!graph.containsKey(arr[0])) graph.put(arr[0],new HashMap<Integer,Integer>());
    	 graph.get(arr[0]).put(arr[1],arr[2]);
     }
     dfs(graph,K,flag,0);
     for(boolean x:flag) if(!x) return -1;
     return count;
    }
void dfs(HashMap<Integer,HashMap<Integer,Integer>> graph,int n,boolean[] flag,int dis)
{
	if(flag[n]) return;
	flag[n]=true;
	count+=dis;
	for(int i:graph.get(n).keySet())
		dfs(graph,i,flag,dis+graph.get(n).get(i));
}
}
