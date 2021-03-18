package oops;

import java.util.Scanner;

 interface Shape1 {
	void accept(Scanner sc);
	void calc_area();
	void dispArea();
}
class Rectangle1 implements Shape1 {
	double length,breadth,area = 0.00;

	@Override
	public void accept(Scanner sc) {
		System.out.println("Enter the length and breadth");
		length = sc.nextDouble();
		breadth = sc.nextDouble();
	}

	@Override
	public void calc_area() {
		area = length * breadth;
		
	}

	@Override
	public void dispArea() {
		System.out.println("Area of rectangle ="+area);
	}
}
	class Square1 implements Shape1 {
		double s,area = 0.0;

		public void accept(Scanner sc) {
			System.out.println("Enter the number");
			s = sc.nextDouble();
		
			
		}

		@Override
		public void calc_area() {
			area = s * s;
			
		}

		@Override
		public void dispArea() {
			System.out.println("Area of Square ="+area);
		}
		
	}
	  class ShapeDemo {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Shape1 obj = null;
			obj = new Rectangle1();
			obj.accept(sc);
			obj.calc_area();
			obj.dispArea();
			
			obj = new Square1();
			obj.accept(sc);
			obj.calc_area();
			obj.dispArea();
		}
	}
