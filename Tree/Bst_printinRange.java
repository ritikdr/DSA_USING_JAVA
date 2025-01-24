public class Bst_printinRange {
    static class node {
        int data;
        node left;
        node right;
        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root,int val) {
        if(root == null) {
            root = new node(val);
            return root;
        }

        if(root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void print(node root,int x,int y) {
        if(root == null) {
            return;
        }

        if(root.data >= x && root.data <= y) {
            print(root.left, x, y);
            System.out.print(root.data+" ");
            print(root.right, x, y);
        } else if(root.data >= y) {
            print(root.left, x, y);
        } else {
            print(root.right, x, y);
        }
    }
    public static void main(String[] args){
        int value[] = {8,5,3,1,4,6,10,11,14};
        node root = null;

        for(int i = 0;i < value.length; i++) {
            root = insert(root,value[i]);
        }

        System.out.print("inorder: ");
        inorder(root);

        System.out.print("\nprint in range: ");
        print(root, 6, 10);
    }
}
