//import java.util.Scanner;
//
//public class CircularQueue {
//    static class Queue {
//        static int arr[];
//        static int front = -1;
//        static int rear = -1;
//        static int size;
//
//        Queue(int size) {
//            this.size = size;
//            arr = new int[size];
//        }
//
//        public static boolean isEmpty() {
//            return front == -1 && rear == -1;
//        }
//        public static boolean isFull() {
//            return (rear+1) % size == front;
//        }
//        public static void enQueue(int data) {
//            if (isFull()) {
//                System.out.println("Queue is full");
//                return;
//            }
//            if(front == -1) {
//                front = 0;
//            }
//            rear = (rear + 1) % size;
//            arr[rear] = data;
//        }
//        public static int deQueue() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int result = arr[front];
//            if (front == rear) {
//                front = -1;
//                rear = -1;
//            }else{
//            front = (front + 1) % size;
//            }
//            return result;
//        }
//        public static int peek() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return arr[front];
//        }
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of the queue");
//        int size = sc.nextInt();
//        Queue queue = new Queue(size);
//        System.out.println("Enter the elements of the queue");
//        for (int i = 0; i < size; i++) {
//            queue.enQueue(sc.nextInt());
//        }
//        while (!queue.isEmpty()) {
//            System.out.println(queue.deQueue());
//        }
//        System.out.println(queue.isEmpty());
//        queue.enQueue(4);
//        System.out.println(queue.peek());
//
//
//    }
//}
public class CircularQueue {
    public int Cqarr[];
    public int size;
    public int front;
    public int rear;
    CircularQueue(int size) {
        this.size = size;
        Cqarr = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1&&rear == -1;
    }
    public boolean isFull() {
        return (rear+1)%size == front;
    }
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(front == -1) {
            front = 0;
        }
        rear=(rear+1)%size;
        Cqarr[rear]=data;
    }
    public int dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if(front == rear) {
            front = -1;
            rear = -1;

        }
        int result = Cqarr[front];
        front = (front+1)%size;
        return result;
    }
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return Cqarr[front];
    }
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++) {
            System.out.print(Cqarr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        queue.dequeue();
        queue.display();
    }
}