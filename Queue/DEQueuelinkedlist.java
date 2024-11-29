public class DEQueuelinkedlist {
    static class node{
        int data;
        node next;
        node prev;
        node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void main(String[] args) {
        node q1 = new node(4);
        node q2 = new node(9);
        node q3 = new node(0);
        node q4 = new node(1);

        q1.next = q2;
        q2.next = q3;
        q3.next = q4;

        q4.prev = q3;
        q3.prev = q2;
        q2.prev = q1;

        Queue Q = new Queue();
        Q.front = q1;
        Q.rear = q4;

        System.out.print("Queue is: ");
        Q.display();

        node newnode = new node(7);
        Q.equeuefront(newnode);
        System.out.print("\nAfter adding 7 to the front:");
        Q.display();

        node newnode1 = new node(2);
        Q.equeuerear(newnode1);
        System.out.print("\nAfter adding 2 to the rear:");
        Q.display();

        Q.dequeuerear();
        System.out.print("\nAfter removing from the rear:");
        Q.display();

        Q.dequeue();
        System.out.print("\nAfter removing from the front:");
        Q.display();

    }
    static class Queue {
        node front, rear;

        Queue() {
            this.front = this.rear = null;
        }

        boolean isEmpty() {
            return front == null;
        }

        void equeuefront(node newnode) {
            if(isEmpty()) {
                front = rear = newnode;
                return;
            }
            newnode.next = front;
            front.prev = newnode;
            front = newnode;
        }

        void equeuerear(node newnode) {
            if(isEmpty()) {
                front = rear = newnode;
                return;
            }
            rear.next = newnode;
            newnode.prev = rear;
            rear = newnode;
        }

        int dequeue() {
            if(isEmpty()) {
                System.out.print("queue is empty.");
                return -1;
            }
            int data = front.data;
            front = front.next;
            if(front != null) {
                front.prev = null;
            } else {
                rear = null;
            }
            return data;
        }

        int dequeuerear() {
            if(isEmpty()) {
                System.out.print("queue is empty.");
                return -1;
            }
            int data = rear.data;
            rear = rear.prev;
            if(rear != null) {
                rear.next = null;
            } else {
                front = null;
            }
            return data;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            node current = front;
            while(current != null) {
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.out.print("null");
        }
    }
}
