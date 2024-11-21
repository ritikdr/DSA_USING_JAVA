public class createDoubli {
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
        node n1 = new node(3);
        node n2 = new node(9);
        node n3 = new node(0);
        node n4 = new node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        System.out.println("forward doubli linked list: ");
        node current = n1;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

        System.out.println("backward doubli linked list: ");
        current = n4;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }
}
