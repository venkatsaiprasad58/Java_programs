package patterns;

import java.util.Scanner;

public class Twin_prime_numbers_range {
	static String res = "";
	static boolean isPrimenumber(int num) {
		boolean b = false;
		int flag = 0 ;
		for (int i = 2; i <= num / 2; i++) {
			if(num % i == 0 ) {
				flag++;
				break;
			}
		}
		if(flag == 0) {
			b = true ;
		}
		
		return b;
	}
	
	static String twinPrimeNumber(int start_value , int end_value) {
		for (int i = start_value; i <= end_value; i++) {
			if(isPrimenumber(i) == true && isPrimenumber(i+2) == true) {
				res += " ( "+i +","+(i+2)+" )";
			}			
		}		
		return res;		
	}

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Two Numbers ");
		System.out.println(twinPrimeNumber(scn.nextInt(), scn.nextInt()));
	}
	

}
