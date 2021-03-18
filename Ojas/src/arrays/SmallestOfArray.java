package arrays;

import java.util.Scanner;

public class SmallestOfArray {
	static int smallest(int values[]) {
		int small = values[0];
		for(int i = 0; i < values.length; i++) {
			if(values[i] < small) {
				small = values[i];
			}
		}
		return small;
			
	}
	
	
	public static void main(String[] args) {
		int number[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elemnts");
		for(int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
			
		}
		System.out.println("Smallest vales :" +smallest(number));
	}

}
