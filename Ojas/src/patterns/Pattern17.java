package patterns;

public class Pattern17 {

	public static void main(String[] args) {
		String res ="";
		int rows,columns;

		for( rows = 0; rows < 5; rows++)
		{
			for(columns = 5-rows; columns > 1 ; columns--)
			{
				res += " ";
			}
			for(columns = 0; columns <= rows; columns++) {
				res += "1 ";
			}
			
			res += "\n";
		}
		System.out.println(res);
	}

}

//	  1 
//   1 1 
//  1 1 1 
// 1 1 1 1 
//1 1 1 1 1 