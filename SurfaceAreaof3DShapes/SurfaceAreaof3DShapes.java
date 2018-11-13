package SurfaceAreaof3DShapes;

public class SurfaceAreaof3DShapes {

public int surfaceArea(int[][] grid) {
     int area=0;
     for(int i=0;i<grid.length;i++)
     {
    	 for(int j=0;j<grid[0].length;j++)
    	 {
    		 area+=grid[i][j]*6;
    		 if(i>0) area-=2*Math.min(grid[i][j],grid[i-1][j]);
    		 if(j>0) area-=2*Math.min(grid[i][j],grid[i][j-1]);
    	 }
     }
     return area;
    }
}
