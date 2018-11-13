package RangeAddition;

public class Improve {

	public int[] getModifiedArray(int length, int[][] updates) {
	     int[] arr=new int[length];
	     for(int[] update:updates)
	     {
	    	 int s=update[0];
	    	 int e=update[1];
	    	 int in=update[2];
	    	 arr[s]+=in;
	    	 if(e+1<arr.length)
	    		 arr[e+1]-=in;
	     }
	     int sum=0;
	     for(int i=0;i<arr.length;i++)
	     {
	    	 sum+=arr[i];
	    	 arr[i]=sum;
	     }
	     return arr;
	    }
}

