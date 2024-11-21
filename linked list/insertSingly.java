public class insertSingly {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        node n1 = new node(2);
        node n2 = new node(8);
        node n3 = new node(4);
        node n4 = new node(0);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println("traversal of linked list: ");
        traversal(n1);

        node newnode = new node(99);
        node n = insert(n1, newnode, 3);
        System.out.println("after insert a node in linked list: ");
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

    public static node insert(node head, node newnode, int position) {
        if (position == 1) {
            newnode.next = head;
            return newnode;
        }

        node current = head;
        for (int i = 1; i < position - 1 && current.next != null; i++) {
            current = current.next;
        }

        if (current.next != null) {
            newnode.next = current.next;
            current.next = newnode;
        }
        return head;
    }
}