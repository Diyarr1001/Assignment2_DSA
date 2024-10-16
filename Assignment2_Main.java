package assignment2;

import java.util.Scanner;

public class Assignment2_Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Assignment2 obj = new Assignment2();
		System.out.println("Enter size");
		int size = in.nextInt();
		obj.create_Queue(size);
		int ch, e;
		do {
			System.out.println("\n Queue Menu");
			System.out.println("-----------");
			System.out.println("1.Enqueu 1");
			System.out.println("2.Enqueu 2");
			System.out.println("3.Dequeu 1");
			System.out.println("4.Dequeu 2");
			System.out.println("5.Print all elements of 1");
			System.out.println("6.Print all elements of 2");
			System.out.println("0.Exit");
			System.out.println("-----------");
			System.out.println("Choice:");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (obj.is_Full1() != true) {
					System.out.println("Enter a number:");
					e = in.nextInt();
					obj.enqueue1(e);
				} else {
					System.out.println("queue Full");
				}
				break;
			case 2:
				if (obj.is_Full2() != true) {
					System.out.println("Enter a number:");
					e = in.nextInt();
					obj.enqueue2(e);
				} else {
					System.out.println("queue Full");
				}
				break;
			case 3:
				if (obj.is_Empty1() != true) {
					System.out.println("Element poped is " + obj.dequeue1());
				} else {
					System.out.println("queue Empty");
				}
				break;
			case 4:
				if (obj.is_Empty2() != true) {
					System.out.println("Element poped is " + obj.dequeue2());
				} else {
					System.out.println("queue Empty");
				}
				break;
			case 5:
				if (obj.is_Empty1() != true) {
					System.out.println("Elements in queue are\n");
					obj.print_Queue1();
					;
				} else {
					System.out.println("queue Empty");
				}
				break;
			case 6:
				if (obj.is_Empty2() != true) {
					System.out.println("Elements in queue are\n");
					obj.print_Queue2();
					;
				} else {
					System.out.println("queue Empty");
				}
				break;
			case 0:
				System.out.println("Thanks for using code ");
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;
			}
		} while (ch != 0);

	}

}
