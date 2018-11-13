package DesignHitCounter;

import java.util.TreeMap;

public class Improve {

    /** Initialize your data structure here. */
	int[] times;
	int[] hits;
    public Improve() {
    	times=new int[300];
    	hits=new int[300];
    }
    
    /** Record a hit.
        @param timestamp - The current timestamp (in seconds granularity). */
    public void hit(int timestamp) {
    	int time=timestamp%300;
    	if(times[time]==timestamp)
    		hits[time]++;
    	else {
    		times[time]=timestamp;
    		hits[time]=1;
    	}
    }
    
    /** Return the number of hits in the past 5 minutes.
        @param timestamp - The current timestamp (in seconds granularity). */
    public int getHits(int timestamp) {
    	int sum=0;
    	for(int i=0;i<300;i++)
    		sum+=timestamp-300<times[i]?hits[i]:0;
        return sum;
    }
}
