package TotalHammingDistance;

public class TotalHammingDistance {

public int totalHammingDistance(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
        	for(int j=i+1;j<nums.length;j++)
        	{
        		sum+=Integer.bitCount(nums[i]^nums[j]);
        	}
        }
        return sum;
    }
int hamming(int i,int j) {
	int count=0;
	while(i>0||j>0)
	{
		if((i&1)!=(j&1))
			count++;
		i>>=1;
		j>>=1;
	}
	return count;
}
}
