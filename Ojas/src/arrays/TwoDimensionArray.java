package arrays;

import java.util.Scanner;

public class TwoDimensionArray {
	static void liststudentMarks(String student[][]) {
		for(int i = 0; i < student.length; i++ ) {
			for(int j =0; j < student[i].length; j++) {
				System.out.print(student[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		String student[][] = new String[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 12 names");
		for(int i = 0; i < student.length; i++ ) {
			for(int j = 0;j < student[i].length; j++) {
				student[i][j] = sc.next();

			}
		}
		
		liststudentMarks(student);
		

	}
}


//output

//anusha ramesh tharun prasad 
//seenu sai kalpana sravanthi 
//rashi ramya rajesh prince 