package arrays;

import java.util.Scanner;
public class FiveSubjectMarks {
	static void dispMarks(int marks[]) {
		int sum = 0;
		System.out.println("marks as follows");
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			sum += marks[i];
		}
		System.out.println("sum of marks "+sum);
	}


	public static void main(String[] args) {
	int marks[] = new int[5];
	System.out.println("Enter" + marks.length + "sub marks ");
	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < marks.length; i++) {
		marks[i] = sc.nextInt();
	}
	dispMarks(marks);
	sc.close();
	}
	
}
