public class createLinkedListStack {
    static class Node {
        char value;
        Node next;

        Node(char value) {
            this.value = value;
            this.next = null;
        }
    }
    public static void main(String[] args) {

        Node s1 = new Node('A');
        Node s2 = new Node('B');
        Node s3 = new Node('C');

        s1.next = s2;
        s2.next = s3;

        System.out.print("\nStack elements: ");
        display(s1);

        Node s = push(s1, 'D');
        s1 = push(s,'E');
        System.out.print("Stack: ");
        display(s1);

        System.out.println("peek element: "+ peek(s1));
        s1 = pop(s1);
        System.out.print("After pop Stack: ");
        display(s1);
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node push(Node head, char value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node pop(Node head) {
        if(head == null) {
            System.out.println("Stack is empty. cannot pop. ");
            return null;
        } 
        return head.next;
    }
    public static char peek(Node head) {
        if(head == null) {
            System.out.println("Stack is empty. cannot peek. ");
            return '\0';
        }
        return head.value;
    }
}
