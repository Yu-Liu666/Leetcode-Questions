package StrobogrammaticNumber;

import java.util.HashMap;

public class StrobogrammaticNumber {

public boolean isStrobogrammatic(String num) {
     int i=0, j=num.length()-1;
     while(i<=j)
     {
    	 if(!"00 11 88 696".contains(num.charAt(i++)+""+num.charAt(j--)))
    		 return false;
     }
     return true;
    }
}
