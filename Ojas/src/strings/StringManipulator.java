package strings;

import java.util.Scanner;

public class StringManipulator {
		static String removeVowel(String name) {
			String res ="";
			for(int i = 0 ; i< name.length();i++) {
				
			if(!("AEIOU".contains(""+ name.toUpperCase().charAt(i)))) {
				res += name.charAt(i);
			}
			}
			if(res == "") {
				return null;
			}
		
			return res;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String name  = sc.next();
		System.out.println(removeVowel(name));
	}
	

}
