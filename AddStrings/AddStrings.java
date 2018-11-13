package AddStrings;

public class AddStrings {

public String addStrings(String num1, String num2) {
     StringBuilder res=new StringBuilder();
     int i=num1.length()-1,j=num2.length()-1;
     int temp=0;
     while(i>=0||j>=0)
     {
    	 if(i>=0)
    		 temp+=num1.charAt(i--)-'0';
    	 if(j>=0)
    		 temp+=num2.charAt(j--)-'0';
    	 res.insert(0,temp%10);
    	 temp/=10;
     }
     if(temp!=0) res.insert(0,temp);
     return res.toString();
    }
}
