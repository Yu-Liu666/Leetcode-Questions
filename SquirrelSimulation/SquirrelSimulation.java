package SquirrelSimulation;

public class SquirrelSimulation {

	 public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
		 int n=nuts.length;
		 int min=Integer.MAX_VALUE;
		 int[] nutsToTree=new int[n];
		 int[] nutsToSquirrel=new int[n];
		 int sum=0;
		 for(int i=0;i<n;i++)
		 {
			 nutsToTree[i]=Math.abs(nuts[i][0]-tree[0])+Math.abs(nuts[i][1]-tree[1]);
			 sum+=nutsToTree[i]*2;
			 nutsToSquirrel[i]=Math.abs(nuts[i][0]-squirrel[0])+Math.abs(nuts[i][1]-squirrel[1]);
		 }
		 
		 for(int i=0;i<n;i++)
			 min=Math.min(min,sum-nutsToTree[i]+nutsToSquirrel[i]);
		 return min;
	 }
}
