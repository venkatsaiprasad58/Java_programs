package basicprograms;

public class DoWhileDemo {

	public static void main(String[] args) {
		int i =1;
		String res = "";
		do
		{
			res += "welcome\n";
			i++;
		}
		while(i <= 5);//if we give more than number it will print at least one time
		System.out.println(res);

	}

}
