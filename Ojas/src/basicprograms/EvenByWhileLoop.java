package basicprograms;

import java.util.Scanner;

public class EvenByWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int startvalue = sc.nextInt();
		int endvalue = sc.nextInt();
		String res = "";
		if(startvalue % 2 != 0)
		{
			startvalue += 1;
		}
		int i = startvalue;
		while(i <= endvalue)
		{
			res += i+" ";
			i = i + 2;
					
		}
		System.out.println(res);

	}

}
