package PathSumIV;

public class PathSumIV {

    public int pathSum(int[] nums) {
        int[] sum=new int[1];
        int[] number= {-1,0,2,6};
        dfs(0,nums,sum,0,-1,number);
        return sum[0];
    }
void dfs(int pos,int[] nums,int[] sum,int s,int n,int[] number) {
	
	boolean flag=true;
	if(pos==0) n=nums[pos];
	for(int i=pos;i<nums.length;i++)
	{
		if(pos==0||i==pos) continue;
		int d2=(nums[i]/10)%10;
		int d3=nums[i]/100;
		int p=number[d3-1]+d2;
		if(p/2==(number[n/100-1]+(n/10)%10))
		{
            System.out.println("sss");
			flag=false;
			dfs(i,nums,sum,s+n%10,nums[i],number);
		}
	}
       if(flag) sum[0]+=s+n%10;
}
}
