public class DEQueueArray {
    public static void main(String[] args) {
        int[] arr = {4,6,4,2,7,9,0};

        Queue Q = new Queue(arr);

        System.out.print("Queue is: ");
        Q.display();

        int n = 1;
        Q.enqueuefront(n);
        System.out.print("\nAfter add element at front: ");
        Q.display();

        int m = 5;
        Q.enqueuerear(m);
        System.out.print("\nAfter add element at rear: ");
        Q.display();

        Q.dequeuefront();
        System.out.print("\nAfter dequeue element at front: ");
        Q.display();

        Q.dequeuerear();
        System.out.print("\nAfter dequeue element at rear: ");
        Q.display();

        System.out.print("\nIs Queue is Empty? " + Q.isEmpty());
    }
    static class Queue{
        int[] arr;
        int front, rear;
        Queue(int[] arr) {
            this.arr = arr;
            this.front = 1;
            this.rear = arr.length;
        }

        boolean isEmpty() {
            return front > rear;
        }

        boolean isFull() {
            return rear == arr.length;
        }

        void enqueuefront(int value) {
            if(isFull()) {
                System.out.println("Queue is Full.");
                return;
            }
            arr[front - 1] = value;
            front = front - 1;
        }

        void enqueuerear(int value) {
            if(isFull()) {
                System.out.println("Queue is Full.");
                return;
            }
            arr[rear + 1] = value;
            rear = rear + 1;
        }

        int dequeuefront() {
            if(isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr[front++];
        }

        int dequeuerear() {
            if(isEmpty()) {
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[rear--];
        }

        void display() {
            if(isEmpty()) {
                System.out.print("Queue is Empty.");
                return;
            }

            for(int num : arr) {
                System.out.print(num + " ");
            }
            return;
        }
    }
}