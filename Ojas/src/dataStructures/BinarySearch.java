package dataStructures;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to search");
		int a[] = {10,20,30,40,50};
		int key = sc.nextInt();
		int last = a.length-1;
		int res = binarySearch(a,0,last,key);
		if(res == -1) {
			System.out.println("element is not found");
		}
		else {
			System.out.println("element is found in :"+res);
		}

	}

	private static int binarySearch(int[] a, int first, int last, int key) {
		if(last >= first) {
			int mid = first + last / 2;
			if(a[mid] == key) {
				return mid;
			}
			if(a[mid] >= key) {
				return binarySearch(a,first,mid-1,last);
			}
			else {
				return binarySearch(a,mid+1,last,key);
			}
		}
			
		return -1;
	}

}
