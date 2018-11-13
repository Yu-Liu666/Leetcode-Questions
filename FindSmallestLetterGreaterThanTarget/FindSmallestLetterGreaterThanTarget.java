package FindSmallestLetterGreaterThanTarget;

public class FindSmallestLetterGreaterThanTarget {

	 public char nextGreatestLetter(char[] letters, char target) {
		 int lo=0,hi=letters.length-1;
		 while(lo<=hi)
		 {
			 int mid=lo+(hi-lo)/2;
			 if(letters[mid]>target) {
				 if(mid-1>=0&&letters[mid-1]<=target) return letters[mid];
				 hi=mid;
			 }
			 else lo=mid+1;
		 }
		 return letters[0];
     }
}
