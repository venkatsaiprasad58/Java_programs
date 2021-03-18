package dataStructures;

import java.util.Scanner;

public class MenuDrivenapplication {
	static int top = -1;
	static int size = 5;
	static int stack[] = new int[size];
	
	static void menu() {
		String m = "Menu driven application \n";
		m += "1.push\n";
		m += "2.pop\n";
		m += "3.display elements\n";
		m += "4.exit\n";
		m += "5.select any option\n";
		System.out.println(m);
	}
	static boolean isFull() {
		boolean b = false;
		if(top == size-1) {
			b = true;
		}
		return b;
	}
	static boolean isEmpty() {
		boolean b = false;
		if(top == size-1) {
			b = true;
		}
		return b;
	}
	static void push(int element) {
		if(!isFull()) {
			stack[++top] = element;
			System.out.println("add element to stack");
		}
		else {
			System.out.println("Stack is full");
		}
	}
	static void pop() {
		if(!isEmpty()) {
			System.out.println("Delete an element is =" +stack[top]);
			top--;
		}
		else {
			System.out.println("stack is empty");
		}
	}
	static void display() {
		if(!isEmpty()) {
			System.out.println("Stack elements are as follows");
			for(int i =0;i <= top; i++) {
				System.out.println(stack[i]);
			}
		}
		else {
			System.out.println("No elements in the stack");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			menu();
			int choice = sc.nextInt();
			switch(choice) { 
			case 1 :
				System.out.println("Enter the any value");
				push(sc.nextInt());
				break;
			case 2 :
				pop();
				break;
			case 3 :
				display();
				break;
			case 4 :
				System.exit(0);
				break;
				default :
					System.out.println("Invalid option");
				
			}
		}
	}

}
