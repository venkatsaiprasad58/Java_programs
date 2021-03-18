package strings;

public class internDemo {

	public static void main(String[] args) {
		
		
		String s = new String("prasad");
		String s1 = new String("prasad");
		
		s = s.intern();
		s1 = s1.intern();
		
		System.out.println(s == s1);
		
		String s2 = new String("rayudu");
		String s3 = new String("rayudu");
		
		
		System.out.println(s2 == s3);
		
		
	}

}
