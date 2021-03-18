package strings;

public class RegexDemo {

	public static void main(String[] args) {
		//Regex = RegularExpression
		
		String regex = "^123456789$";
		
		String regex1 = "^prasad$";
		
		System.out.println("12345".matches(regex));
		System.out.println("156754".matches(regex));
		System.out.println("1235".matches(regex));
		System.out.println("123456789".matches(regex));
		
		
		System.out.println("prasad".matches(regex1));
		System.out.println("prad".matches(regex1));
		System.out.println("p....d".matches(regex1));

	}

}
