public class StackArr {
    private int[] stack;
    private int top;
    private int size;
    public StackArr(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
        System.out.println(  data+" pushed into stack");
        return;
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(  stack[top--]+" popped from the stack");
        return;
    }
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return ;
        }
        System.out.println(  stack[top]+" peeked into stack");

    }
    public boolean isEmpty() {
        return top == -1;
    }
    private void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        System.out.println("Stack Elements:");
        for (int i = 0; i <= top; i++) {

            System.out.println(stack[i]);

        }
        return;
    }
    public static void main(String[] args) {
        StackArr stack = new StackArr(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.display();
    }
}
