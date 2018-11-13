package MultiplyStrings;

public class MultiplyStrings {

	public String multiply(String num1, String num2) {
        StringBuilder str=new StringBuilder();
		 int[] ans=new int[num1.length()+num2.length()];
		 for(int i=num1.length()-1;i>=0;i--)
		 {
			 for(int j=num2.length()-1;j>=0;j--)
			 {
				 int l=i+j,r=i+j+1;
				 int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0')+ans[r];
				 ans[r]=mul%10;
				 ans[l]+=mul/10;
			 }
		 }
		 int index=0;
		 while(index<ans.length&&ans[index]==0) index++;
		 for(int i=index;i<ans.length;i++)
			 str.append(ans[i]);
		 return str.toString().equals("")?"0":str.toString();
   }
}
