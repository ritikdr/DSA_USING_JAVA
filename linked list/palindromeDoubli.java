public class palindromeDoubli {
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
        node n1 = new node(8);
        node n2 = new node(0);
        node n3 = new node(8);

        n1.next = n2;
        n2.next = n3;

        n3.prev = n2;
        n2.prev = n1;

        System.out.println("ftraversal: ");
        ftraversal(n1);

        System.out.println("btraversal: ");
        btraversal(n3);

        if(ispalindrome(n1, n3)) {
            System.out.println("linked list is palindrome.");
        } else {
            System.out.println("linked list is not palindrome.");
        }
    }
    public static void ftraversal(node head) {
        node current = head;
        while(current != null) {
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void btraversal(node head) {
        node current = head;
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.prev;
        }
        System.out.println("null");
    }

    public static boolean ispalindrome(node head, node tail) {
        while(head != null && tail != null) {
            if(head.data != tail.data) {
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }
}
