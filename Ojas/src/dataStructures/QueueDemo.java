package dataStructures;

import java.util.Scanner;

public class QueueDemo {
	static int front = 0;
	static int size = 5;
	static int rear = 0;
	static int queue[] = new int[size];
	
	static void menu() {
		String m = "Menu driven application \n";
		m += "1.insert\n";
		m += "2.delete\n";
		m += "3.display elements\n";
		m += "4.exit\n";
		m += "5.select any option\n";
		System.out.println(m);
	}
	static boolean isFull() {
		boolean b = false;
		if(rear == size) {
			b = true;
		}
		return b;
	}
	static boolean isEmpty() {
		boolean b = false;
		if(front == rear) {
			b = true;
		}
		return b;
	}
	static void insert(int element) {
		if(!isFull()) {
			queue[rear++] = element;
			System.out.println("add element to queue");
		}
		else {
			System.out.println("queue is full");
		}
	}
	static void delete() {
		if(!isEmpty()) {
			System.out.println("Delete an element is =" +queue[front]);
			for(int i = 0;i<rear-1;i++) {
				queue[i] = queue[i+1];
			}
			rear--;
		}
		else {
			System.out.println("queue is empty");
		}
	}
	static void display() {
		if(!isEmpty()) {
			System.out.println("queue elements are as follows");
			for(int i =front;i <= rear; i++) {
				System.out.println(queue[i]);
			}
		}
		else {
			System.out.println("No elements in the queue");
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
				insert(sc.nextInt());
				break;
			case 2 :
				delete();
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
