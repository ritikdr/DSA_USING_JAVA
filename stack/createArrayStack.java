public class createArrayStack {
    static class stack {
        int[] stack;
        int capacity;
        int top;

        stack(int capacity) {
            this.capacity = capacity;
            this.stack = new int[capacity];
            this.top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public void print() {
            if (isEmpty()) {
                System.out.print("stack is Empty.");
                return;
            }
            for (int j = 0; j <= top; j++) {
                System.out.print(stack[j] + " ");
            }
            System.out.println();

        }

        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full.");
                return;
            }
            stack[++top] = value;
            return;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("stack is Empty.");
                return -1;
            }
            return stack[top--];
        }
    }

    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(20);
        s.push(10);
        s.push(30);
        s.push(40);

        s.print();

        s.pop();

        s.print();
    }
}
