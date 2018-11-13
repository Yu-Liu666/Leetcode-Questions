package IntegerReplacement;

public class IntegerReplacement {

	  public int integerReplacement(int n) {
	       return dfs(n);
	     }
	  int dfs(int n){
	     if(n==1) return 0;
	     if (n == 2147483647) {
	         return Math.min(1 + integerReplacement(2147483647 - 1), 2 + integerReplacement((2147483646 / 2) + 1));
	     }
	     if(n<=0) return Integer.MAX_VALUE;
	     if(n%2==0) return 1+dfs(n/2);
	     else {
	    	 int x1=dfs(n-1);
	    	 int x2=dfs(n+1);
	    	 return Math.min(x1,x2)+1;
	    }
	    }
}
