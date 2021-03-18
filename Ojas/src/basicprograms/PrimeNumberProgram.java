package basicprograms;

import java.util.Scanner;

public class PrimeNumberProgram {
		static boolean checkForPrime(int num) {
			boolean isItPrime = true;
 
				if(num <= 1) {
						isItPrime = false;
 
						return isItPrime;
					}
					else {
						for (int i = 2; i <= num/2; i++) {
							if ((num % i) == 0) {
								isItPrime = false;
 
								break;
							}
						}
 
						return isItPrime;
					}
		}
 
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
 
			System.out.println("Enter a number :");
 
			int num = sc.nextInt();
 
			boolean isItPrime = checkForPrime(num);
 
			if (isItPrime) {
				System.out.println(num+" is a prime number.");
			}
			else {
				System.out.println(num+" is not a prime number.");
			}
 
			sc.close();
		}
	}