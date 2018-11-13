package BoatstoSavePeople;

import java.util.Arrays;
import java.util.PriorityQueue;

public class BoatstoSavePeople {

public int numRescueBoats(int[] people, int limit) {
     Arrays.sort(people);
     int count=0;
     int lo=0,hi=people.length-1;
     while(lo<=hi)
     {
    	 if(lo==hi) {
    		 count++;
    		 break;
    	 }
    	 int remain=limit-people[hi];
    	 if(people[lo]<=remain) lo++;
    	 hi--;
    	 count++;
     }
     return count;
     
    }
}
