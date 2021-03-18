package patterns;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		int rows,columns;
		String res ="";
		for( rows = 1; rows <= 5; rows++)
		{
			for(columns = 1; columns <= 5; columns++)
			{
				res += columns+" ";
				
			}
			res += "\n";
			
		}
		System.out.println(res);

	}

}