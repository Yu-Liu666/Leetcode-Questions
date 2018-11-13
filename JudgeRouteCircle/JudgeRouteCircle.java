package JudgeRouteCircle;

public class JudgeRouteCircle {

	public boolean judgeCircle(String moves) {
		int[] state=new int[2];
		for(int i=0;i<moves.length();i++)
		{
			if(moves.charAt(i)=='U')
				state[0]++;
			if(moves.charAt(i)=='D')
				state[0]--;
			if(moves.charAt(i)=='R')
				state[1]++;
			if(moves.charAt(i)=='L')
				state[1]--;
		}
		if(state[0]!=0||state[1]!=0)
			return false;
		return true;
    }
}
