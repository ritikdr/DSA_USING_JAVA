package Queue;

public class queuearray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,4,8,9,0};

        queue queue = new queue(arr);

        System.out.print("Queue is: ");
        queue.print(arr);

        // queue.equeue(7);
        // System.out.print("after equeue of element in queue: ");
        // queue.print(arr);

        System.out.println("dequeue element is: " + queue.dequeue());

        System.out.print("after dequeue of element in queue: ");
        queue.print(arr);

        System.out.println("\nIs the queue empty? " + queue.isEmpty());

        System.out.println("Is the queue full? " + queue.isFull());
    }
    static class queue {
        int[] arr;
        int front, rear;

        queue(int[] arr) {
            this.arr = arr;
            this.front = 0;
            this.rear = arr.length - 1;
        }

        boolean isEmpty() {
            return front > rear;
        }

        boolean isFull() {
            return rear == arr.length - 1;
        }

        // void equeue(int value) {
        //     if(isFull()) {
        //         System.out.println("Queue is Full.");
        //     } 
        //     arr[rear + 1] = value;
        //     rear = rear + 1;
        // }

        int dequeue() {
            if(isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }
            return arr[front++];
        }

        void print(int[] arr) {
            if(isEmpty()) {
                System.out.println("Queue is Empty.");
                return;
            }
            for(int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
