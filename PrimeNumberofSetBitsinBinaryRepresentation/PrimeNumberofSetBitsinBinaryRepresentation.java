package PrimeNumberofSetBitsinBinaryRepresentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PrimeNumberofSetBitsinBinaryRepresentation {

	 public int countPrimeSetBits(int L, int R) {
	        List<Integer> list=Arrays.asList(2,3,5,7,11,13,17,19,23,29,31);
	        int res=0;
	        for(int i=L;i<=R;i++)
	        {
	        	if(list.contains(Integer.bitCount(i)))
	        		res++;
	        }
	        return res;
	    }
}
