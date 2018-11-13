package NthDigit;

public class NthDigit {

	public int findNthDigit(int n) {
		long count=9;
        int len=1,start=1;
		while(n>len*count)
		{
			n-=count*len;
			count*=10;
			len++;
			start*=10;
		}
		start=start+(n-1)/len;
        String t=String.valueOf(start);
		int remainder=(n-1)%len;
		return Character.getNumericValue(t.charAt(remainder));
	}
}
