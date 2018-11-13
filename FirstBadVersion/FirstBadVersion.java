package FirstBadVersion;

public class FirstBadVersion {

	public int firstBadVersion(int n) {
		int lo=1,hi=n;
		while(lo<=hi)
		{
			int mid=lo+(hi-lo)/2;
			if(isBadVersion(mid))
			{
				if(mid-1>=0&&isBadVersion(mid-1))
					hi=mid-1;
				else 
					return mid;
			}
			else
				lo=mid+1;
		}
		return lo;
    }
}
