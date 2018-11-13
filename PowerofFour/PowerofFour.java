package PowerofFour;

public class PowerofFour {

public boolean isPowerOfFour(int num) {
    int index=0;
    while(num>0)
    {
   	 if((num&1)==1) {
   		 if(index%2!=0)
   			 return false;
   		 else {
   			 if(num>>1==0)
   				 return true;
   			 else
   				 return false;
   		 }
   	 }
        num>>=1;
        index++;
    }
    return false;
    }
}
