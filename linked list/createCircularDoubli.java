public class createCircularDoubli {
    static class node {
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
        node n1 = new node(7);
        node n2 = new node(6);
        node n3 = new node(5);
        node n4 = new node(3);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;
        n1.prev = n4;

        System.out.println("forward circular doubli linked list:");
        node current = n1;
        node start = n1;
        System.out.print(current.data + " -> ");
        current = current.next;
        while(current != start) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("...");

        System.out.println("backward circular doubli linked list: ");
        current = n4;
        start = n4;
        System.out.print(current.data + " -> ");
        current = current.prev;
        while(current != start) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("...");
    }
}
