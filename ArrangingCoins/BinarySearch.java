package ArrangingCoins;

public class BinarySearch {

	public int arrangeCoins(int n) {
		 long n1=(long)n;
	     long lo=1,hi=n1;
		   while(lo<=hi)
		   {
			   long mid=lo+(hi-lo)/2;
			   if((mid+1)*mid<=2*n1) lo=mid+1;
			   else hi=mid-1;
		   }
		   return (int)lo-1;
	}
}
