package PeakIndexinaMountainArray;

public class Improve {

	 public int peakIndexInMountainArray(int[] A) {
		 int lo=0, hi=A.length-1;
		 while(lo<hi)
		 {
			 int mid=lo+(hi-lo)/2;
			 if(A[mid-1]>A[mid]) hi=mid;
			 else if(A[mid]<A[mid+1]) lo=mid;
			 else return mid;
		 }
		 return 0;
	 }
}
