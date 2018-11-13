package ProjectionAreaof3DShapes;

public class ProjectionAreaof3DShapes {

	 public int projectionArea(int[][] grid) {
	     int sum=0;
	     for(int i=0;i<grid.length;i++)
	     {
	    	 int row=0;
	    	 int col=0;
	    	 for(int j=0;j<grid[0].length;j++)
	    	 {
	    		 row=Math.max(row,grid[i][j]);
	    		 col=Math.max(col,grid[j][i]);
	    		 if(grid[i][j]!=0) sum++;
	    	 }
	    	 sum+=row+col;
	     }
	     return sum;
	    }
}
