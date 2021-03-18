package dataStructures;

import java.util.Scanner;

public class SelectionSort {
	static void selectionSort(int array[]) {
		int temp;
		for(int i = 0;i < array.length;i++) {
			for(int j = i+1;j<array.length;j++) {
				if(array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		int size = sc.nextInt();
		System.out.println("you haved entered elements :" + size );
		int array[] = new int[size];
		for(int index = 0; index < array.length; index++) {
			array[index] = sc.nextInt();
		}
		System.out.println("result is found");
		selectionSort(array);
	}
	
}


