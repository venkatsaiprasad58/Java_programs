package oops;

abstract class Animal {
	abstract void SoundOfAnimal();
	void disp() {
		System.out.println("Hi");
	}
}
class Cat extends Animal {
	void SoundOfAnimal() {
		System.out.println("meeooh");
	}
}
class Dog extends Animal {
	void SoundOfAnimal() {
		System.out.println("bow bow");
	}
}
 class AbstractDemo {
	public static void main(String[] args) {
		Animal obj = null;
		obj = new Cat();
		obj.disp();
		obj.SoundOfAnimal();
		
		obj = new Dog();
		obj.disp();
		obj.SoundOfAnimal();
		
	}
}