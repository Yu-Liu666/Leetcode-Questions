package PerfectNumber;

public class PerfectNumber {

public boolean checkPerfectNumber(int num) {
	if(num<=1) return false;
    int sum=1;
	for(int i=2;i<=Math.sqrt(num);i++)
	{
		if(num%i==0)
		{
			if(num/i!=i)
				sum+=num/i+i;
			else
				sum+=i;
		}
	}
	return num==sum;
}
}
