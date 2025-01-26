public class circularqueueLinkedlist {
    static class node{
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(60);
        q.display();

        // q.dequeue();
    }
    static class queue {
        node front, rear;
        queue() {
            this.front = this.rear = null;
        }

        boolean isEmpty() {
            return front == null;
        }

        void enqueue(int value) {
            node newnode = new node(value);
            if(isEmpty()) {
                front = rear = newnode;
                rear.next = front;
            } else {
                rear.next = newnode;
                rear = newnode;
                rear.next = front; 
            }
        }
        int dequeue() {
            if(isEmpty()) {
                System.out.print("queue is empty.");
                return -1;
            } 
            int value = front.data;
            if(front == rear) {
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front;
            }
            return value;
        }
        void display() {
            if(isEmpty()) {
                System.out.print("queue is empty.");
                return;
            } 
            node current = front;
            System.out.print(current.data + " ");
            current = current.next;
            while(current != front) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
