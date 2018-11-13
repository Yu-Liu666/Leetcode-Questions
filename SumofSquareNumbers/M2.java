package SumofSquareNumbers;

import java.util.HashSet;

public class M2 {

	 public boolean judgeSquareSum(int c) {
		 HashSet<Integer> set=new HashSet<>();
		 for(int i=0;i<=Math.sqrt(c);i++)
		 {
			 int m=i*i;
             
			 if(m+m==c||set.contains(c-m)) return true;
			 set.add(m);
		 }
		 return false;
	 }
}
