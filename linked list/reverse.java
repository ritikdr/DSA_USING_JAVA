public class reverse {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        node n1 = new node(3);
        node n2 = new node(6);
        node n3 = new node(2);
        node n4 = new node(0);
        node n5 = new node(8);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println("Singly linked list: ");
        traversal(n1);

        System.out.println("after reverse a singly linked list: ");
        node n = reversenode(n1);
        traversal(n);
    }

    public static void traversal(node head) {
        node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.next;
        }
        System.out.println("null");

    }

    public static node reversenode(node head) {
        if (head == null || head.next == null) {
            return head;
        }
        node prevnode = null;
        node current = head;
        while (current != null) {
            node nextnode = current.next;
            current.next = prevnode;
            prevnode = current;
            current = nextnode;
        }
        return prevnode;
    }
}
