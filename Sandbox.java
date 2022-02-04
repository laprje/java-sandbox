package cs2420sandbox;

import java.util.Arrays;

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


	public static <T extends Comparable<T>> T median(T[] arr) {
		Arrays.sort(arr, (x,y) -> x.compareTo(y));
		return arr[arr.length/2];
	}

	public static void main(String[] args) {
		Double[] array = new Double[16];
		for(int i =0; i<array.length; i++){
			array[i] = Math.random() * 100;
		}
		System.out.println(median(array));
	}
}
