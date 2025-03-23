//public class Queue1 {
//    static class Queue {
//        static int arr[];
//        static int rear;
//        static int size;
//
//        Queue(int n) {
//            this.size = n;
//            arr = new int[n];
//            this.rear = -1;
//
//        }
//
//        public static void makeEmpty() {
//            if (isEmpty()){
//                System.out.println("Queue is already empty");
//            }
//            else {
////
//                rear = -1;
//            }
//        }
//
//
//        public static boolean isEmpty() {
//            return rear == -1;
//        }
//
//        public static boolean isFull() {
//            return rear == size - 1;
//        }
//
//        public static void enqueue(int x) {
//            if (isFull()) {
//                System.out.println("Queue is full");
//                return;
//            }
//            arr[++rear] = x;
//        }
//
//        public static int dequeue() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int front;
//            front = arr[0];
//            for (int i = 0; i < rear; i++) {
//                arr[i] = arr[i + 1];
//            }
//            rear--;
//            return front;
//
//        }
//
//        public static int peek() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return arr[rear];
//        }
//
//        public static void display() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//            }
//            for (int i = 0; i <= rear; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        Queue q = new Queue(5);
//        q.enqueue(10);
//        q.enqueue(20);
//        q.enqueue(30);
//        q.enqueue(40);
//        q.enqueue(50);
//        System.out.println(q.dequeue());
//        q.display();
//        q.makeEmpty();
//        q.display();
//
//    }
//
//}
public class Queue1{
    public int Qrr[];
    public int size;
    public int rear;
    public Queue1(int size){
        this.size = size;
        Qrr = new int[size];
        rear = -1;
    }
    public boolean isEmpty(){
        return rear == -1;
    }
    public boolean isFull(){
        return rear==size - 1;
    }
    public void makeEmpty(){
        if(isEmpty()){
            System.out.println("Queue is already empty");
        }
        else{
            rear = -1;
        }
    }
    public void enqueue(int x){
       if(isFull()){
           System.out.println("Queue is full");
           return;
       }
       else{
           Qrr[++rear] = x;
       }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int result = Qrr[0];
            for(int i=0; i<rear; i++){
                Qrr[i] = Qrr[i+1];
            }
            rear--;
            return result;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }

            return Qrr[rear];

    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        for(int i=0; i<=rear; i++){
            System.out.print(Qrr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue1 q = new Queue1(5);
        q.enqueue(1);
        q.enqueue(2);

        q.display();
        q.dequeue();
        q.display();
    }

}