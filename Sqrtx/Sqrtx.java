package Sqrtx;

public class Sqrtx {

	public int mySqrt(int x) {
		int lo=1, hi=x;
		while(lo<=hi)
		{
			int mid=lo+(hi-lo)/2;
			if(mid*mid<=x) lo=lo+1;
			else hi=mid-1;
		}
		return lo-1;
    }
}
