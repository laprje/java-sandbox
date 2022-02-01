package cs2420sandbox;

public class Sandbox {
//	public static void main(String[] args) {
//		boolean b = true;
//		if(10 > 100 && b) 
//		  System.out.print("1");
//		else
//		  System.out.print("2");
//		if(10 > 100 || b) 
//		  System.out.println("3");
//	}

	private static int binarySearch0(Object[] a, int fromIndex, int toIndex, Object key) {
		int low = fromIndex;
		int high = toIndex - 1;

		while (low <= high) {
			int mid = (low + high) >>> 1;
			@SuppressWarnings("rawtypes")
			Comparable midVal = (Comparable) a[mid];
			@SuppressWarnings("unchecked")
			int cmp = midVal.compareTo(key);

			if (cmp < 0)
				low = mid + 1;
			else if (cmp > 0)
				high = mid - 1;
			else
				return mid; // key found
		}
		return -(low + 1); // key not found.
	}

}
