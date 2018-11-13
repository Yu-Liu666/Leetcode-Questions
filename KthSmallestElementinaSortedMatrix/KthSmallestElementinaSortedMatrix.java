package KthSmallestElementinaSortedMatrix;

import java.util.PriorityQueue;

public class KthSmallestElementinaSortedMatrix {

public int kthSmallest(int[][] matrix, int k) {
     PriorityQueue<Integer> pq=new PriorityQueue<>();
     for(int i=0;i<matrix.length;i++)
     {
    	 for(int j=0;j<matrix[0].length;j++)
    		 pq.add(matrix[i][j]);
     }
     while(k>0)
     {
    	 int x=pq.poll();
    	 k--;
    	 if(k==0) return x;
     }
     return 0;
    }
}
