package arrays;

import java.util.Scanner;

public class SumOfArray {
	static void listStudentMarks(int student[][]) {
		for(int i =0; i < student.length;i++) {
			for(int j = 0; j < student[i].length;j++) {
				System.out.println(student[i][j] +" ");
			}
		}
	}
		static int[] totalMarks(int student[][]) {
			int total[] = new int[student.length];
			for(int i = 0; i < student.length; i++) {
			int	tot = 0;
			for(int j = 0;j < student[i].length; j++) {
				tot += student[i][j];
			}
			total[i] = tot;
				System.out.println();
			}
			
		return total;
	}

	public static void main(String[] args) {
		int student[][] = new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		for(int i = 0; i < student.length;i++ ) {
			for(int j= 0; j < student[i].length;j++) {
				student[i][j] = sc.nextInt();
			}
		}
		listStudentMarks(student);
		for(int x: totalMarks(student)) {
			System.out.println("Total marks =" +x);
		}
	}

}
