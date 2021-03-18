package oops;
class BaseClass {
	 void disp() {
		System.out.println("Base class..");
	}
}
class DerivedClass extends BaseClass {
		 void disp() {
		super.disp();
		System.out.println("Derived class..");
	}
}
public class RunTimeDemo {

	public static void main(String[] args) {
		DerivedClass d = new DerivedClass();
		d.disp();

	}

}
