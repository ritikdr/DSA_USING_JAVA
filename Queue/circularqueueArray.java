public class circularqueueArray {
    public static void main(String[] args) {
        queue q = new queue(6);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); 

        q.dequeue();
        q.display(); 

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.enqueue(70); 
        q.display();

        q.dequeue();
        q.dequeue();
        q.display(); 

        q.enqueue(80);
        q.enqueue(90);
        q.display();
    }
    static class queue {
        int[] queue;
        int front;
        int rear;
        int capacity;
        queue(int size) {
            capacity = size;
            front = rear = -1;
            queue = new int[capacity];
        }

        boolean isEmpty() {
            return front == -1;
        }

        boolean isFull() {
            return front == ((rear + 1) % capacity);
        }

        void enqueue(int value) {
            if(isFull()) {
                System.out.println("Queue is full.");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % capacity;
            queue[rear] = value;
        }

        void dequeue() {
            if(isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
        }

        void display() {
            if(isEmpty()) {
                System.out.println("Queue is empty.");
            }
            System.out.print("Queue: ");
            int i = front;
            while (true) {
                System.out.print(queue[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % capacity;
            }
            System.out.println();
        }
    }
}
