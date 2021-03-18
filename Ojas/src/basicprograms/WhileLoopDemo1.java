package basicprograms;

public class WhileLoopDemo1 {

	public static void main(String[] args) {
		String res = "";
		int i = 1;
		while(i<=5)
		{
			res += i + ",";
			i++;
		}//while loop closing
			System.out.println(res.substring(0,res.length()-1));
	}//main closing
}// class closing
