package strings;

public class Demo1 {

	public static void main(String[] args) {
		String str = "abcdefghijklmno";
		
		System.out.println(str.length());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.indexOf("d"));
		
		System.out.println(str.indexOf("abc"));
		
		System.out.println(str.indexOf("m"));
		
		String values = "1,4-3,12-9";
		
		values = values.replaceAll("-", ",");
		
		System.out.println(values);
		
		String v[] = values.split(",");
		
		for(String x : v) {
			System.out.println(x); 
		}

	}

}
