package GuessNumberHigherorLower;

public class GuessNumberHigherorLower {

public int guessNumber(int n) {
     int lo=1,hi=n;
     while(lo<=hi)
     {
    	 int mid=lo+(hi-lo)/2;
    	 if(guess(mid)==-1) lo=mid+1;
    	 else if(guess(mid)==1) hi=mid-1;
    	 else return mid;
     }
     return 0;
    }
}
