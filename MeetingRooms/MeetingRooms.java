package MeetingRooms;

import java.util.Arrays;

public class MeetingRooms {

public boolean canAttendMeetings(Interval[] intervals) {
     Arrays.sort(intervals,(a,b)->a.start-b.start);
     int end=-1;
     for(Interval interval:intervals) {
    	 if(end!=-1)
    	 {
    		 if(end>interval.start)
    			 return false;
    	 }
    	 end=interval.end;
     }
     return true;
    }
}
