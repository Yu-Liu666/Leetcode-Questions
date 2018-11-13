package BitwiseANDofNumbersRange;

public class BitwiseANDofNumbersRange {

	 public int rangeBitwiseAnd(int m, int n) {
	        int sum=0;
	        for(int i=0;i<32;i++)
	        {
	        	boolean flag=true;
	        	for(int j=m;j<=n;j++)
	        	{
	        		if(((j>>i)&1)==0)
	        		{
	        			flag=false;
	        			break;
	        		}
	        		if(flag)
	        		sum+=Math.pow(2,i);
	        	}
	        }
	        return sum;
	    }
}
