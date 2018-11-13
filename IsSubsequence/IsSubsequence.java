package IsSubsequence;

public class IsSubsequence {

public boolean isSubsequence(String s, String t) {
	boolean[][] dp=new boolean[s.length()+1][t.length()+1];
    for(int i=0;i<dp[0].length;i++)
        dp[0][i]=true;
    for(int i=0;i<s.length();i++)
    	for(int j=0;j<t.length();j++)
    		dp[i+1][j+1]=s.charAt(i)==t.charAt(j)?dp[i][j]:dp[i+1][j];
    return dp[s.length()][t.length()];
    }
}
