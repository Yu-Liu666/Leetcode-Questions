package RectangleOverlap;

public class RectangleOverlap {

public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return Math.max(rec1[2],rec2[2])-Math.min(rec1[0],rec2[0])>0&&
        		Math.max(rec1[3],rec2[3])-Math.min(rec1[1],rec2[1])>0;
    }
}
