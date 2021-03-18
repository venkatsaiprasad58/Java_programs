package recursion;

import java.util.Scanner;

public class AddAll {
	static int display(int num) {
		if(num!= 10) {
		return num + display(num + 1);
		}
		else
			return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number only 5");
		int num = sc.nextInt();
		System.out.println(display(num));
	}
	

}
