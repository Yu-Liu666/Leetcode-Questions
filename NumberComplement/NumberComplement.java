package NumberComplement;

public class NumberComplement {

	 public int findComplement(int num) {
		 int res=0;
		 int order=0;
		 while(num!=0)
		 {
			 int digit=num&1;
			 if(digit==0)
				 res+=Math.pow(2,order);
			 order++;
			 num>>=1;
		 }
		 return res;
	 }
}
