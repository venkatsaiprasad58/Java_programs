package oops;

public class Rectangle {
	double length;
	double breadth;
	

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	 
	public double getArea() {
		double area = this.breadth * this.length;
		return area;
		
	}
	public double getPerimeter() {
		double peri = 2*(this.breadth * this.length);
		return peri;
	}



}
