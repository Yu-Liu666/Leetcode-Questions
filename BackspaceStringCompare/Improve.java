package BackspaceStringCompare;

public class Improve {

	public boolean backspaceCompare(String S, String T) {
	    
		 int b1=0,b2=0, i, j;
			for(i=S.length()-1,j=T.length()-1;;i--,j--)
			{
				while(i>=0&&(b1>0||S.charAt(i)=='#')) {if(S.charAt(i)=='#') b1++;else b1--;  i--;}
				while(j>=0&&(b2>0||T.charAt(j)=='#')) {if(T.charAt(j)=='#') b2++;else b2--; j--;}
				if(i>=0&&j>=0&&S.charAt(i)!=T.charAt(j)) return false;
				if(i==-1||j==-1) return i==-1&&j==-1;
			}
	}
}
