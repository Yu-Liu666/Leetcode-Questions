package LonelyPixelI;

import java.util.HashSet;

public class LonelyPixelI {

public int findLonelyPixel(char[][] picture) {
        
		HashSet<Integer> row=new HashSet<>();
		HashSet<Integer> col=new HashSet<>();
		int res=0;
		for(int i=0;i<picture.length;i++)
		{
			int x1=0;
			for(int j=0;j<picture[0].length;j++)
			{
				if(picture[i][j]=='B') x1++;
				if(x1>1) break;
			}
			if(x1>1) row.add(i);
		}
		
		for(int i=0;i<picture[0].length;i++)
		{
			int x1=0;
			for(int j=0;j<picture.length;j++)
			{
				if(picture[i][j]=='B') x1++;
				if(x1>1) break;
			}
			if(x1>1) col.add(i);
		}
		
		for(int i=0;i<picture.length;i++)
		{
			for(int j=0;j<picture[0].length;j++)
			{
				if(picture[i][j]=='B'&!row.contains(i)&&!col.contains(i))
					res++;
			}
		}
		
		
		return res;
    }
boolean dfs(char[][] picture,int x,int y,boolean[][] flag) {
	if(x<0||x>=picture.length||y<0||y>=picture[0].length||picture[x][y]=='W')
		return true;
	if(flag[x][y]) return false;
	flag[x][y]=true;
	return dfs(picture,x-1,y,flag)&&dfs(picture,x+1,y,flag)&&dfs(picture,x,y-1,flag)&&dfs(picture,x,y+1,flag);
}
}
