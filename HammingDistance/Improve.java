package HammingDistance;

public class Improve {

	public int hammingDistance(int x, int y) {
	     return Integer.bitCount(x^y);
	    }
}
