package NumberOfCornerRectangles;

public class NumberOfCornerRectangles {

public int countCornerRectangles(int[][] grid) {
	int res=0;
     for(int i=0;i<grid.length-1;i++)
     {
    	 for(int j=i+1;j<grid.length;j++)
    	 {
    		 int count=0;
    		 for(int col=0;col<grid[0].length;col++)
    		 {
    			 if(grid[i][col]==1&&grid[j][col]==1) count++;
    		 }
    		 if(count>0)
    		 res+=count*(count-1)/2;
    	 }
     }
     return res;
    }
}
