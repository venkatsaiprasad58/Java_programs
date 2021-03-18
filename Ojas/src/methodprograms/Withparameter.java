package methodprograms;

import java.util.Scanner;

public class Withparameter {

	static void calTotal(int first_Num, int sec_Num) {
		System.out.println("Sum = "+(first_Num + sec_Num ));
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  numbers");
		calTotal(sc.nextInt(),sc.nextInt());

	}

}
