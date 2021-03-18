package arrays;

public class Marks {

	public static void main(String[] args) {
		int marks[] = new int[5];
		for(int i = 0; i < marks.length; i++) {
			marks[i] =Integer.parseInt(args[i]);
		}
		int sum = 0;
		System.out.println("Marks are");
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
			sum += marks[i];
		}
			System.out.println("sum of marks :" +sum);
	}

}
