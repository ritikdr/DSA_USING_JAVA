public class traversalSingly {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        node n1 = new node(1);
        node n2 = new node(3);
        node n3 = new node(4);
        node n4 = new node(8);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        System.out.println("traverse: ");
        traverse(n1);
    }

    public static void traverse(node head) { 
        node currentnode = head;
        while (currentnode != null) {
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.next;
        }
        System.out.print("null");
    }
}
