package PeakIndexinaMountainArray;

public class PeakIndexinaMountainArray {

	public int peakIndexInMountainArray(int[] A) {
       for(int i=0;i<A.length;i++)
       {
    	   boolean flag=true;
    	   if(!((i-1>=0&&A[i]>A[i-1])||i==0))
    		   flag=false;
    	   if(!((i+1<A.length&&A[i]>A[i+1])||i==A.length-1))
    		   flag=false;
    	   if(flag) return i;
       }
       return 0;
    }
}
