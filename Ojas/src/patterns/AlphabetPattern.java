package patterns;

public class AlphabetPattern {
	public static void main(String abc[])
	{
		int alphabet=65;  
		String res = "";
		for(int i=1;i<6;i++)
		{            
			for(int j=1;j<=i;j++)
			{
				res += (char)alphabet +" ";
				alphabet++;
			}
			res += "\n";
			
		}
		System.out.println(res);
	}

}
