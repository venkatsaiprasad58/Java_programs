package patterns;

public class Pattern19 {

	public static void main(String[] args) {
		int rows ,columns;
		int i = 4;
		int num = 0;
		String res = "";
		for(rows = 1; rows <= 4; rows++) {
			for(columns = 1;columns <= 4; columns++) {
				if(i % 2 == 0) {
					res += "1"+" ";
				}
				else {
					res += "0"+"";
				}
			}
			res += "\n";
		}
		System.out.println(res);

	}

}
