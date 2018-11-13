package AddDigits;

public class AddDigits {

public int addDigits(int num) {
      
		while(num>0)
		{
			int sum=0;
			int count=0;
			while(num>0)
			{
				sum+=num%10;
				count++;
				num/=10;
			}
			num=sum;
			if(count==1) return num;
		}
		return num;
	
    }
}
