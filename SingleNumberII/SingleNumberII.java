package SingleNumberII;

public class SingleNumberII {

public int singleNumber(int[] nums) {
     int two=0;
     int one=0;
     int common=0;
     for(int n:nums)
     {
    	 two|=(one&n);
    	 one^=n;
    	 common=~(two&one);
    	 one&=common;
    	 two&=common;
     }
     return one;
    }
}
