package arrays;

import java.util.Scanner;

public class DuplicateDemo {
	static void duplicateNum(int[] num) {
		for(int i = 0;i < num.length;i++) {
			for(int j = i+1; j < num.length;j++) {
				if(num[i] == num[j]) {
					System.out.println(num[j]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.println("Enter the "+size+" elements");
		for(int i = 1;i <= num.length-1;i++ ) {
			num[i] = sc.nextInt();
		}
		System.out.println("the duplicate elements is ");
		duplicateNum(num);
	}
}
