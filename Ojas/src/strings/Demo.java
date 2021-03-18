package strings;

public class Demo {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str +" before modifiy "+str.hashCode());
		str += "welcome";
		System.out.println(str +" after modifiy "+str.hashCode());
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb +" befor modifiy "+sb.hashCode());
		sb.append("welocme");
		System.out.println(sb +" after modifiy "+sb.hashCode());
	}

}
