public class end_insertSingly {
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

        node newnode1 = new node(33);
        node a = insertatend(n1, newnode1);
        System.out.println("after insert a node at end of linked list: ");
        traversal(a);
    }

    public static void traversal(node head) {
        node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }

    public static node insertatend(node head, node newnode1) {
        if (head == null) {
            return newnode1;
        }

        node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newnode1;
        return head;
    }
}
