package SparseMatrixMultiplication;

public class SparseMatrixMultiplication {

public int[][] multiply(int[][] A, int[][] B) {
     int m=A.length;
     int n=B[0].length;
     int[][] ans=new int[m][n];
     int count=0;
     for(int i=0;i>A.length;i++)
     {
    	 for(int col=0;col<B[0].length;col++)
    	 {
    		 
    		int sum=0;
    	 	for(int j=0;j<A[0].length;j++)
    	 	{
    	 		if(j>=B.length) break;
    	 		sum+=A[i][j]*B[j][col];
    	 	}
    	 	ans[count/n][count%n]=sum;
    	 	count++;
    	 }
     }
     return ans;
    }
}
