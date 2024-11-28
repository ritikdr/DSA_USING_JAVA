//package Queue;

public class queuelinkedlist {
    static class node{
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node q1 = new node(2);
        node q2 = new node(5);
        node q3 = new node(1);
        node q4 = new node(4);
        node q5 = new node(8);

        q1.next = q2;
        q2.next = q3;
        q3.next = q4;
        q4.next = q5;

        queue queue = new queue();
        queue.front = q1;
        queue.rear = q5;

        System.out.print("Queue using linked list: ");
        queue.print();

        node q6 = new node(9);
        queue.equeue(q6);
        System.out.print("\nAfter insert an element in queue: ");
        queue.print();

        System.out.println("\nDequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        System.out.print("Queue after dequeuing elements: ");
        queue.print();

        System.out.println("\nIs the queue empty? " + queue.isEmpty());

        System.out.println("Is the queue full? " + queue.isFull());

    }
    static class queue {
        node front, rear;
         
        queue() {
            this.front = this.rear = null;
        }

        boolean isEmpty() {
            return front == null;
        }

        boolean isFull() {
            return false;
        }

        void equeue(node newnode) {
            if(rear == null) {
                front = rear = newnode;
                return;
            }
            rear.next = newnode;
            rear = newnode;
        }

        int dequeue() {
            if (front == null) {
                System.out.println("Queue is empty.");
                return -1;
            }
            int value = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }
            return value;
        }
        
        //! display the result queue
        void print() {
            if(isEmpty()) {
                System.out.print("Queue is empty.");
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
