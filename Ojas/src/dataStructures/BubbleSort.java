package dataStructures;

import java.util.Scanner;

public class BubbleSort {
	static void bubbleSort(int[] array) {
		int temp = 0;
		int n = array.length;
		for(int i = 0; i < n; i++ ) {
			for(int j = 1; j < (n-i);j++) {
				if(array[j-1] > array[j]) {
					
					 temp = array[j-1] ;
					array[j-1] = array[j];
					 array[j] =  temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		int size = sc.nextInt();
		
		System.out.println("you have to entered elements :" + size );
		
		int array[] = new int[size];
//		int array[] = {10,20,50,40,30};
		
		for(int index = 0; index < size; index++) {
			array[index] = sc.nextInt();
		}
		System.out.println("result is found");
		bubbleSort(array);
		
		for(int index = 0; index < size; index++) {
			System.out.println(array[index]);
		}
	}
	
}
