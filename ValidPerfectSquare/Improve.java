package ValidPerfectSquare;

public class Improve {

	public boolean isPerfectSquare(int num) {
		int n=1;
		while(num>0)
		{
			num-=n;
			n+=2;
		}
		return num==0;
	}
}
