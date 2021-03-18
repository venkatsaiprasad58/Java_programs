package basicprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check wheather Even or Odd");
		int num = sc.nextInt();
		String res = "";
		if(num == 0) {
		System.out.println("invalid");
		return;
		}
		int exp = num % 2;
		switch(exp)
		{
		case 0 : 
				res = num +" " + "is Even";
				break;
		case 1 : 
				res = num  +" " + "is odd";
				break;
		}
		System.out.println(res);
			   	
		

	}

}
