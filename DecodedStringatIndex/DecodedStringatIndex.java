package DecodedStringatIndex;

public class DecodedStringatIndex {

public String decodeAtIndex(String S, int K) {
     long len=0;
     for(int i=0;i<S.length();i++)
     {
    	 if(Character.isDigit(S.charAt(i)))
    		 len=len*(S.charAt(i)-'0');
    	 else
    		 len++;
     }
     for(int i=S.length()-1;i>=0;i--)
     {
    	 if(Character.isDigit(S.charAt(i)))
    	 {
    		 len/=S.charAt(i)-'0';
    		 K%=len;
    	 }
    	 else {
    	 if(K==0||K==len)
    		 return S.charAt(i)+"";
    	 len--;
    	 }
     }
     return "";
     
    }
}
