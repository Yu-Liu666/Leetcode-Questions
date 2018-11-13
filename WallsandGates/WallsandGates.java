package WallsandGates;

import java.util.LinkedList;
import java.util.Queue;

public class WallsandGates {

public void wallsAndGates(int[][] rooms) {
	Queue<int[]> queue=new LinkedList<>();
     for(int i=0;i<rooms.length;i++)
     {
    	 for(int j=0;j<rooms[0].length;j++)
    	 {
    		 if(rooms[i][j]!=0) continue;
    		 queue.add(new int[] {i,j,0}); 
    		 bfs(rooms,queue);
    	 }
     }
    }
public void bfs(int[][] rooms,Queue<int[]> queue) {
	while(!queue.isEmpty())
	{
		int[] temp=queue.poll();
		int x=temp[0],y=temp[1],dis=temp[2];
		if(x-1>=0&&rooms[x-1][y]!=-1&&rooms[x-1][y]!=0&&(rooms[x-1][y]==2147483647||dis+1<rooms[x-1][y]))
		{
			rooms[x-1][y]=dis+1;
			queue.add(new int[]{x-1,y,dis+1});
		}
		if(y-1>=0&&rooms[x][y-1]!=-1&&rooms[x][y-1]!=0&&(rooms[x][y-1]==2147483647||dis+1<rooms[x][y-1]))
		{
			rooms[x][y-1]=dis+1;
			queue.add(new int[]{x,y-1,dis+1});
		}
		if(x+1<rooms.length&&rooms[x+1][y]!=-1&&rooms[x+1][y]!=0&&(rooms[x+1][y]==2147483647||dis+1<rooms[x+1][y]))
		{
			rooms[x+1][y]=dis+1;
			queue.add(new int[]{x+1,y,dis+1});
		}
		if(y+1<rooms[0].length&&rooms[x][y+1]!=-1&&rooms[x][y+1]!=0&&(rooms[x][y+1]==2147483647||dis+1<rooms[x][y+1]))
		{
			rooms[x][y+1]=dis+1;
			queue.add(new int[]{x,y+1,dis+1});
		}
	}
}
}
