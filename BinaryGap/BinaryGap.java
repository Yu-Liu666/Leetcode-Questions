package BinaryGap;

public class BinaryGap {

	 public int binaryGap(int N) {
	     int pre=-1;
	     int count=0;
	     int min=Integer.MAX_VALUE;
	     while(N>0)
	     {
	    	 if((N&1)==1)
	    	 {
	    		 if(pre!=-1)
	    			 min=Math.min(min,count-pre);
	    		 pre=count;
	    	 }
	    	 count++;
	    	 N>>=1;
	     }
	     return min==Integer.MAX_VALUE?0:min;
	    }
}
