class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class StackLL {
    Node head;
    public void push(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    public int pop() {
        if(head == null){
            return -1;
        }
        Node top = head;
        head = head.next;
        return top.data;
    }
    public int peek() {
        if(head == null){
            return -1;
        }
        Node top = head;
        return top.data;
    }
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackLL obj = new StackLL();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.isEmpty());
        System.out.println(obj.pop());
        System.out.println(obj.peek());
       obj.push(6);
        System.out.println(obj.peek());
        System.out.println(obj.isEmpty());

    }
}
