package HammingDistance;

public class HammingDistance {

public int hammingDistance(int x, int y) {
     int dis=0;
     for(int i=0;i<=31;i++)
     {
    	int t1=x&1;
    	int t2=y&1;
    	if(t1!=t2) dis++;
    	x>>=1;
        y>>=1;
     }
     return dis;
    }
}
