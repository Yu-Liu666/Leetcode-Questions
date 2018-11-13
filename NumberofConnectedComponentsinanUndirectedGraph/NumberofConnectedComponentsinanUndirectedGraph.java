package NumberofConnectedComponentsinanUndirectedGraph;

public class NumberofConnectedComponentsinanUndirectedGraph {

int count=0;
public int countComponents(int n, int[][] edges) {
     int[] graph=new int[n];
     count=n;
     for(int i=0;i<n;i++)
    	 graph[i]=i;
     for(int[] edge:edges)
    	 union(edge[0],edge[1],graph);
     return count;
     
    }
int find(int[] graph,int n) {
	while(n!=graph[n])
		n=graph[n];
	return n;
}

void union(int x,int y,int[] graph) {
	int x1=find(graph,x);
	int y1=find(graph,y);
	if(x1==y1) return;
	graph[x1]=y1;
	count--;
}


}
