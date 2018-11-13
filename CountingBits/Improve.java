package CountingBits;

public class Improve {

	public int[] countBits(int num) {
	     int[] dp=new int[num+1];
	     int order=0;
	     for(int i=1;i<=num;i++)
	     {
	    	 if(Math.pow(2,order)==i)
	    	 {
	    		 dp[i]=1;
	    		 order++;
	    	 }
	    	 else {
	    		 dp[i]=1+dp[i-(int)Math.pow(2,order-1)];
	    	 }
	     }
	     return dp;
	    }
}
