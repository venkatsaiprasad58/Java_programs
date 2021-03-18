package methodprograms;

import java.util.Scanner;

public class WithRetuntypeWithParameters {
	static String calTotal(int f_Num,int s_Num) {
		return "SUM = "+ (f_Num + s_Num);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  numbers");
		String res = calTotal(sc.nextInt(),sc.nextInt());
		System.out.println(res);
	}

}
