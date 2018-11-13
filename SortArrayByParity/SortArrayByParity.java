package SortArrayByParity;

public class SortArrayByParity {

public int[] sortArrayByParity(int[] A) {
     int even=0,odd=A.length-1;
     while(even<odd)
     {
    	 if(A[even]%2==0) even++;
    	 else {
    		 int temp=A[even];
    		 A[even]=A[odd];
    		 A[odd--]=temp;
    	 }
     }
     return A;
    }
}
