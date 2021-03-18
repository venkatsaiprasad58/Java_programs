package strings;

public class EqualsMethod {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		if(str1 == str2) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("botha are not equal");
		}
		if(str1.equals(str2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("botha are not equal");
		}
	}
		
}
