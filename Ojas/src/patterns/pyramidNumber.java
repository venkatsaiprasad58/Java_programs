package patterns;

import java.util.Scanner;

public class pyramidNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of itteration ");
		int itteration = sc.nextInt();
		String left =  "";
		String right = "";
		String spaces = "           ";
		for(int i = 1; i <= itteration; i++) {
			System.out.print(spaces.substring(0,itteration-i));
			System.out.println(left + i + right );
			left += i ;
			right = i + right ;
		}
	}

}
