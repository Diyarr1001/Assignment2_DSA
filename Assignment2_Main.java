package Assignments;

import java.util.Scanner;

public class Assignment2_Main {

	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of the array: ");
	        int n = sc.nextInt();
	        Assignment2 deque = new Assignment2(n);

	        while (true) {
	            System.out.println("\nChoose an option:");
	            System.out.println("1. Enqueue to Queue 1");
	            System.out.println("2. Enqueue to Queue 2");
	            System.out.println("3. Dequeue from Queue 1");
	            System.out.println("4. Dequeue from Queue 2");
	            System.out.println("5. Print Queue 1");
	            System.out.println("6. Print Queue 2");
	            System.out.println("7. Exit");
	            
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter data in Queue 1:");
	                    int data1 = sc.nextInt();
	                    deque.enqueue1(data1);
	                    break;
	                case 2:
	                    System.out.println("Enter data  in Queue 2:");
	                    int data2 = sc.nextInt();
	                    deque.enqueue2(data2);
	                    break;
	                case 3:
	                    deque.dequeue1();
	                    break;
	                case 4:
	                    deque.dequeue2();
	                    break;
	                case 5:
	                    deque.printQueue1();
	                    break;
	                case 6:
	                    deque.printQueue2();
	                    break;
	                case 7:
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice! Please select again.");
	            }
	        }
	    }
}
