package basicprograms;

import java.util.Scanner;

public class Fizz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		String res = "";
		
		if(num % 3 == 0 && num % 5 == 0)
		{
			res += "FizzBizz";
		}
		else if(num % 3 == 0)
		{
			res += "Fizz";
		}
		else if(num % 5 == 0)
		{
			res += "Bizz";
		}
		else 
		{
			res += "Error";
		}
		System.out.println(res);
		

	}

}
