public class createCircularSingly {
    static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
            this.next = null;
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

        node current = n1;
        node start = n1;
        System.out.print(current.data + " -> ");
        current = current.next;
        while(current != start) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("...");
    }
}
