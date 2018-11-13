package SpiralMatrixIII;

public class SpiralMatrixIII {

public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
		int x=0,y=1,n=0,j=1,i=0,dir=0;
		int[][] res=new int[R*C][2];
		res[0]=new int[] {r0,c0};
		int[][] direction= {{0,1},{1,0},{0,-1},{-1,0}};
		while(j<R*C)
		{
			r0+=x;
			c0+=y;
			i++;
			if(r0>=0&&r0<R&&c0>=0&&c0<C)
				res[j++]=new int[] {r0,c0};
			if(i==n/2+1)
			{
				n++;
				i=0;
				dir=(dir+1)%4;
				x=direction[dir][0];
				y=direction[dir][1];
			}
		}
		return res;
    }
}
