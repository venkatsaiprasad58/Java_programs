package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static boolean checkAnagram(String str1,String str2) {
		boolean b = false;
		char ch[] = str1.toLowerCase().toCharArray();
		char ch1[] = str2.toLowerCase().toCharArray();
		int n1 = ch.length;
		int n2 = ch1.length;
		int count =0;
	    for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
					break;
				}
			}
			
		}
	    if(count == n1)
	    	return true;
		return b;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two names");
		System.out.println("is anagram"+" " +checkAnagram(sc.next(),sc.next()));
	}

}
