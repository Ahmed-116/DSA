//public class PriorityQueue2nd {
//    private int capacity; // Maximum size of the queue
//    private int back; // Tracks the last element's index
//    private int[] arr; // Array to store elements
//
//    public PriorityQueue2nd(int n) {
//        arr = new int[n];
//        capacity = n;
//        back = -1; // Initially, the queue is empty
//    }
//
//    // Function to insert an element (in sorted order)
//    public void enqueue(int element) {
//        if (back == capacity - 1) {
//            System.out.println("Queue Overflow");
//            return;
//        }
//        int i = back;
//        while (i >= 0 && arr[i] > element) {
//            arr[i + 1] = arr[i]; // Shift right
//            i--;
//        }
//
//        arr[i + 1] = element; // Insert element
//        back++; // Increase back index
//    }
//
//    // Function to remove the highest priority element (smallest)
//    public int dequeue() {
//        if (back == -1) {
//            System.out.println("Queue Underflow");
//            return -1;
//        }
//
//        int removedElement = arr[0]; // First element is the smallest
//        for (int i = 0; i < back; i++) {
//            arr[i] = arr[i + 1]; // Shift left
//        }
//        back--; // Reduce back index
//
//        return removedElement;
//    }
//
//    // Function to display the queue
//    public void display() {
//        if (back == -1) {
//            System.out.println("Queue is empty");
//            return;
//        }
//        System.out.print("Priority Queue: ");
//        for (int i = 0; i <= back; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        PriorityQueue2nd pq = new PriorityQueue2nd(5);
//
//        pq.enqueue(30);
//        pq.enqueue(10);
//        pq.enqueue(50);
//        pq.enqueue(20);
//        pq.enqueue(40);
//
//        pq.display();
//
//        System.out.println("Dequeued: " + pq.dequeue());
//        pq.display();
//    }
//}
public class PriorityQueue2nd {
    public int arr[];
    public int size;
    public int rear;

    public PriorityQueue2nd(int size) {
        this.size = size;
        arr = new int[size];
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        int i = rear;
        while (i >= 0 && arr[i] > item) {
            arr[i + 1] = arr[i];//move rear one index forward
            i--;
        }
        arr[i + 1] = item;
        rear++;

    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = arr[0];
        for (int i = 0; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return item;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue2nd q = new PriorityQueue2nd(5);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.enqueue(4);
        q.enqueue(5);
        q.display();

    }
}