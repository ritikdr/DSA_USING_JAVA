import java.util.Scanner;

public class Bst {
    static class node{
        int data;
        node left;
        node right;
        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static node insert(node root, int vla) {
        if(root == null) {
            root = new node(vla);
            return root;
        }

        if(root.data > vla) {
            root.left = insert(root.left, vla);
        } else {
            root.right = insert(root.right, vla);
        }

        return root;
    }

    public static void inorder(node root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

        return;
    }

    public static boolean search(node root, int key) {
        if(root == null) {
            return false;
        }

        if(root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static node delete(node root, int key) {
        if(root.data > key) {
            root.left = delete(root.left, key);
        } else if(root.data < key) {
            root.right = delete(root.right, key);
        } else {
            //case 1
            if(root.left == null && root.right == null) {
                return null;
            }
            
            //case 2
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            } 

            //case 3
            node is = inorderSucessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);

        }
        return root;
    }

    public static node inorderSucessor(node root) {
        while(root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int value[] = {8,5,3,1,4,6,10,11,14};
        node root = null;

        for(int i = 0;i < value.length; i++) {
            root = insert(root, value[i]);
        }

        System.out.print("R: ");
        inorder(root);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nenter the node: ");
        int key = sc.nextInt();
        if(search(root,key)) {
            System.out.println("found");
        } else{
            System.out.println("not found");
        }

        System.out.print("\nenter the delete node: ");
        int key1 = sc.nextInt();
        delete(root, key1);
        System.out.print("\nafter delete the node: ");
        inorder(root);
        sc.close();
    }
}
