//import javax.sound.midi.Soundbank;
//import java.util.Scanner;
//
//public class PriorityQueueArray1st {
//    private int[] PQ;
//    private int back;
//    private int capacity;
//
//    public PriorityQueueArray1st(int capacity) {
//        this.capacity = capacity;
//        PQ = new int[capacity];
//        back = -1;
//    }
//
//    // Enqueue (Insert element)
//    public void enqueue(int E) {
//        if (back == capacity - 1) {
//            System.out.println("Queue Overflow");
//            return;
//        }
//        back++;
//        PQ[back] = E;
//    }
//
//    // Find index of minimum element
//    private int findIndexOfMin() {
//        int minIndex = 0;
//        for (int i = 1; i <= back; i++) {
//            if (PQ[i] < PQ[minIndex]) {
//                minIndex = i;
//            }
//        }
//        return minIndex;
//    }
//
//    // Dequeue (Remove highest priority element)
//    public int dequeue() {
//        if (back == -1) {
//            System.out.println("Queue Underflow");
//            return -1;
//        }
//
//        int index = findIndexOfMin(); // Find smallest element (highest priority)
//        int E = PQ[index];
//
//        // Shift elements left
//        for (int i = index; i < back; i++) {
//            PQ[i] = PQ[i + 1];
//        }
//
//        back--; // Reduce queue size
//        return E;
//    }
//
//    // Display queue
//    public void display() {
//        for (int i = 0; i <= back; i++) {
//            System.out.print(PQ[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//
//                PriorityQueueArray1st pq = new PriorityQueueArray1st(5);
//
//                pq.enqueue(30);
//                pq.enqueue(10);
//                pq.enqueue(50);
//                pq.enqueue(20);
//
//                pq.display(); // Example Output: 30 10 50 20
//
//                System.out.println("Dequeued: " + pq.dequeue()); // Removes 10 (highest priority)
//                pq.display(); // Example Output: 30 50 20
//
//
//
//    }
//
//}
//
//
public class PriorityQueueArray1st {
    public int PQarr[];
    public int size;
    public int rear;
    public PriorityQueueArray1st(int size) {
        this.size = size;
        PQarr = new int[size];
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
            return;
        }
        PQarr[++rear] = item;

    }
    public int findMinimum() {
        int number=0;
       for (int i=1; i<=rear; i++) {
           if (PQarr[i]<PQarr[number]) {
               number=i;
           }
       }
       return number;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int result = PQarr[0];
        int index=findMinimum();
        for (int i=index; i<rear; i++) {
            PQarr[i]=PQarr[i+1];
        }
        rear--;
        return result;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
       for (int i=0; i<=rear; i++) {
           System.out.print(PQarr[i]+" ");
       }
       System.out.println();
    }
    public static void main(String[] args) {
        PriorityQueueArray1st pq = new PriorityQueueArray1st(5);
        pq.enqueue(4);
        pq.enqueue(2);
        pq.enqueue(3);
        pq.enqueue(1);
        pq.enqueue(5);
        pq.display();
        pq.dequeue();
        pq.display();

    }
}
