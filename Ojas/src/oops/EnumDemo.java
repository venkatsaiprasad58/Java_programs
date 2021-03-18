package oops;
enum Demo {
	ADD,SUB,MUL,DIV
}
public class EnumDemo {
	int a,b;
	Demo d;
	

	public EnumDemo(int a, int b, Demo d) {
		super();
		this.a = a;
		this.b = b;
		this.d = d;
	}
	String getDemo() {
		String res = "";
		switch(d) {
				case ADD:
					res = "sum = " + (a + b);
					break;
				case SUB:
					res = "sub = " + (a - b);
					break;
				case MUL:
					res = "mul = " + (a * b);
					break;
				case DIV:
					res = "div = " + (a / b);
					break;
					
		}
		return res;
	}

	public static void main(String[] args) {
		EnumDemo ed = new EnumDemo(32, 20,Demo.ADD ) ;
		System.out.println(ed.getDemo());

	}

}
