public class circularlinkedlist {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node n1 = new node(4);
        node n2 = new node(2);
        node n3 = new node(7);
        node n4 = new node(0);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;

        traversal(n1);

        node newnode = new node(77);
        // node n = insert(n1, newnode, 2);
        // traversal(n);

        node m = insert(n1, newnode);
        traversal(m);
    }
    public static void traversal(node head) {
        node currentnode = head;
        node startnode = head;
        System.out.print(currentnode.data + " -> ");
        currentnode = currentnode.next;
        while(currentnode != startnode) {
            System.out.print(currentnode.data + " -> ");
            currentnode = currentnode.next;
        }
        System.out.println(" .... ");
    }
    // public static node insert(node head, node newnode, int position) {
    //     if (head == null) {
    //         newnode.next = newnode;
    //         return newnode;
    //     }
    //     if (position == 1) {
    //         node lastnode = head;
    //         while(lastnode.next != head) {
    //             lastnode = lastnode.next;
    //         }
    //         newnode.next = head;
    //         head = newnode;
    //         lastnode.next = head;
    //         return head;
    //     }

    //     node currentnode = head;
    //     for(int i = 1;i < position - 1 && currentnode.next != head;i++) {
    //         currentnode = currentnode.next;
    //     }

    //     newnode.next = currentnode.next;
    //     currentnode.next = newnode;
    //     return head;
    // }

    public static node insert(node head, node newnode) {
        if (head == null) {
            newnode.next = newnode;
            return newnode;
        }

        node last = head;
        while(last.next != head) {
            last = last.next;
        }
        last.next = newnode;
        newnode.next = head;

        return head;
    }
}
