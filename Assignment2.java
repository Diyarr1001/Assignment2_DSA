package assignment2;

public class Assignment2 {
	private int queue[], Maxsize, f, r, f1, r1, mid;

	public void create_Queue(int size) {
		f = mid + 1;
		r = mid + 1;
		f1 = r;
		r1 = f;
		mid = Maxsize / 2;
		queue = new int[size];
		Maxsize = size;
	}

	void enqueue1(int e) {
		r++;
		queue[r] = e;
		System.out.println("Element " + e + "inseretd in queue");
	}

	void enqueue2(int e) {
		r1++;
		queue[r1] = e;
		System.out.println("Element " + e + "inseretd in queue");
	}

	boolean is_Full1() {
		if (r == Maxsize - 1)
			return true;
		else
			return false;
	}

	boolean is_Full2() {
		if (r1 == Maxsize - 1)
			return true;
		else
			return false;
	}

	int dequeue1() {
		int temp = queue[f];
		f++;
		return (temp);
	}

	int dequeue2() {
		int temp = queue[f1];
		f1++;
		return (temp);
	}

	boolean is_Empty1() {
		if (f > r)
			return true;
		else
			return false;
	}

	boolean is_Empty2() {
		if (f1 > r1)
			return true;
		else
			return false;
	}

	void print_Queue1() {
		for (int i = f; i <= r; i++) {
			System.out.println(queue[i]);
		}
	}

	void print_Queue2() {
		for (int i = f1; i <= r1; i++) {
			System.out.println(queue[i]);
		}
	}
}
