package recursion;

import java.util.Scanner;

class Prime {
	public static void main(String[] args) {
		String res = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		if(getPrime(sc.nextInt(),2)) {
			res += "prime nuber";
		}
		else {
			res += "not prime";
		}
		System.out.println(res);
	}

	private static boolean getPrime(int num, int value) {
		
		if(num <= 2) 
			return(num == 2) ? true : false;
		if(num % value == 0)
			return false;
		if(value * value > num)
			return true;
		return getPrime(num,value+1);
	}
}