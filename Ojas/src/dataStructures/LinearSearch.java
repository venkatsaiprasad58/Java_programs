package dataStructures;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {10,20,30,40,50};
		System.out.println("Enter the number to search");
		int key = sc.nextInt();
		System.out.println(key + "is found in index:" +linearSearch(a,key));
	}

	private static int linearSearch(int[] a, int key) {
			for(int i = 0; i<= a.length;i++) {
				if(a[i] == key) {
					return i;
				}
			}
		return -1;
	}

}
