package HappyNumber;

import java.util.HashSet;

public class Improve {

	public boolean isHappy(int n) {
	     int slow=next(n);
	     int fast=next(next(n));
	     while(slow!=fast)
	     {
	    	 slow=next(slow);
	    	 fast=next(next(fast));
	     }
	     if(slow==1) return true;
	     else return false;
	    }
	int next(int n) {
	    
    	 int sum=0;
    	 while(n>0)
    	 {
    		 sum+=(int)Math.pow(n%10,2);
    		 n/=10;
    	 }
	     return sum; 
	}
}
