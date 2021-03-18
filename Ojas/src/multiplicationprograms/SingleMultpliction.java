package multiplicationprograms;

import java.util.Scanner;

public class SingleMultpliction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to multiply");
		int num = sc.nextInt();
		String res = "";
		for(int i = 1; i <= 10; i++) { 
			res  += num + "*" + i + " = " +(num * i)  +"\n";
		}
		System.out.println(res);

	}

}
