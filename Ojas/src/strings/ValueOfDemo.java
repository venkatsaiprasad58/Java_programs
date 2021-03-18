package strings;
import java.util.*;
public class ValueOfDemo {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		System.out.println(i);
		String name = i.toString();
		System.out.println(name.length());
		
		
		int a = 10;
		String str = String.valueOf(a);
		System.out.println(str.length());
		Date d = new Date();
		System.out.println(str.valueOf(d));

	}

}
