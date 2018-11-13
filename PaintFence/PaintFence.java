package PaintFence;

public class PaintFence {

public int numWays(int n, int k) {
	if(n==0||k==0) return 0;
    if(n==1) return k;
    int[] same=new int[n];
    int[] diff=new int[n];
    same[1]=same[0]=k;
    diff[0]=k;
    diff[1]=k*(k-1);
    for(int i=2;i<n;i++)
    {
    	same[i]=diff[i-1];
    	diff[i]=(k-1)*same[i-1]+diff[i-1]*(k-1);
    }
    return same[n-1]+diff[n-1];
    }
}
