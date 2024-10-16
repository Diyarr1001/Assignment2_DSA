package Assignments;

public class Assignment2 {

	 
	private int[] arr;
    private int size;
    private int front1, rear1, front2, rear2;

    public Assignment2(int n) {
        size = n;
        arr = new int[n];
        
        
        front1 = rear1 = (n / 2) - 1; 
        front2 = rear2 = n / 2;        
    }

   
    public void enqueue1(int data) {
        if (rear1 < 0) {
            System.out.println("Queue 1 full");
            return;
        }
        arr[rear1--] = data;
    }

   
    public void enqueue2(int data) {
        if (rear2 >= size) {
            System.out.println("Queue 2 full");
            return;
        }
        arr[rear2++] = data;
    }

    
    public void dequeue1() {
        if (front1 == rear1) {
            System.out.println("Queue 1 Underflow");
            return;
        }
        System.out.println("Dequeued from Queue 1: " + arr[++front1]);
    }

    
    public void dequeue2() {
        if (front2 == rear2) {
            System.out.println("Queue 2 Underflow");
            return;
        }
        System.out.println("Dequeued from Queue 2: " + arr[--front2]);
    }

   
    public void printQueue1() {
        if (front1 == rear1) {
            System.out.println("Queue 1 is Empty");
            return;
        }
        System.out.print("Queue 1: ");
        for (int i = front1 + 1; i <= rear1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

   
    public void printQueue2() {
        if (front2 == rear2) {
            System.out.println("Queue 2 is Empty");
            return;
        }
        System.out.print("Queue 2: ");
        for (int i = front2 - 1; i >= rear2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


