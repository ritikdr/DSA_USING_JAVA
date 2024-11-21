public class insertdoubli {
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

        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;

        node newnode = new node(99);

        System.out.println("forward doubli linked list:");
        traversal_forward(n1);
        System.out.println("after insert a node in doubli linked list: ");
        node n = insert_forward(n1, newnode, 2);
        traversal_forward(n);

        System.out.println("backward doubli linked list: ");
        traversal_backward(n4);
        System.out.println("after insert a node in doubli linked list: ");
        node m = insert_backward(n4, newnode, 3);
        traversal_backward(m);
    }
    public static void traversal_forward(node head) {
        node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void traversal_backward(node head) {
        node current = head;
        while(current != null) {
            System.out.print(current.data + " -> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    public static node insert_forward(node head, node newnode, int position) {
        if (position == 1) {
            newnode.next = head;
            return newnode;
        }

        node current = head;
        for(int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next != null) {
            newnode.next = current.next;
            current.next = newnode;
        }
        return head;
    }
    public static node insert_backward(node head, node newnode, int position) {
        if(position == 1) {
            newnode.prev = head;
            return newnode;
        }

        node current = head;
        for(int i = 1; i < position - 1 && current.prev != null; i++) {
            current = current.prev;
        }

        if(current.prev != null) {
            newnode.prev = current.prev;
            current.prev = newnode;
        }
        return head;
    }
}
