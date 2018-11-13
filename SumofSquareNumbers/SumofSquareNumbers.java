package SumofSquareNumbers;

public class SumofSquareNumbers {

	 public boolean judgeSquareSum(int c) {
		 int lo=0, hi=(int)Math.sqrt(c);
		 while(lo<=hi)
		 {
			 int mid=lo*lo+hi*hi;
			 if(mid==c) return true;
			 else if(mid<c) lo++;
			 else hi--;
		 }
		 return false;
	 }
}
