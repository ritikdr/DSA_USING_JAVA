public class end_deleteSingly {
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
        
        node m = delete(n1);
        System.out.println("after delete a node in linked list: ");
        traversal(m);
    }
    public static void traversal(node head) {
        node currentnode = head;
        while(currentnode != null) {
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.next;
        }
        System.out.println("null");
    }

    public static node delete(node head) {
        if(head == null) {
            return head;
        }

        node last = head;
        while(last.next.next != null) {
            last = last.next;
        }
        last.next = null;
        return head;
    }
}
