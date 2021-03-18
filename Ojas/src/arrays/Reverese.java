package arrays;

import java.util.Scanner;

public class Reverese {
	static int[] naturalNum(int[]array) {
		int[] res = new int[array.length];
		int k = 0;
		for(int index1 = array.length-1;index1 > 0;index1--) {
			res[k++] = array[index1];
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get reverse");
		int size = sc.nextInt();
		int array[] = new int[size];
		System.out.println("enter "+size+" elements");
		for(int index = 0; index <= array.length;index++) {
			array[index] = sc.nextInt();
		}
		System.out.println(naturalNum(array));

	}

}
