package IsGraphBipartite;

public class IsGraphBipartite {

	  public boolean isBipartite(int[][] graph) {
		     int[] flag=new int[graph.length];
		     for(int i=0;i<graph.length;i++)
		     { 
		         if(flag[i]==0)
		         if(!dfs(flag,graph,1,i)) return false;
		     }
		        return true;
		    }
		boolean dfs(int[] flag,int[][] graph,int color,int n) {
			if(flag[n]!=0) return color==flag[n];
		    System.out.println(flag[n]+" "+color);
			flag[n]=color;
			color=color==-1?1:-1;
		     System.out.println(flag[n]+" "+color);
			for(int i=0;i<graph[n].length;i++) {
				if(!dfs(flag,graph,color,graph[n][i]))
					return false;
			}
			return true;
		}
}
