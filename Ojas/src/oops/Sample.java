package oops;

public class Sample {
	Sample() {
		System.out.println("Default construter");
	}
	void Sample() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		Sample s = new Sample();//Default construter
		s.Sample();//hi
	}

}
