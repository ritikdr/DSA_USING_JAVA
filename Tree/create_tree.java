import java.util.*;

public class create_tree {
    static class node{
        int data;
        node left;
        node right;
        node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class tree {
        static int idx = -1;
        public static node buildtree(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }
            node newnode = new node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
    }
    public static void preorder(node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(node root) {
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(node root) {
        if(root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelorder(node root) {
        if(root == null) {
            return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()) {
            node currentnode = q.remove();
            if(currentnode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentnode.data);
                if(currentnode.left != null){
                    q.add(currentnode.left);
                }
                if (currentnode.right != null) {
                    q.add(currentnode.right);
                }
            }
        } 
    }

    public static int countofnode(node root) {
        if(root == null) {
            return 0;
        }

        int leftcount = countofnode(root.left);
        int rightcount = countofnode(root.right);

        return leftcount + rightcount + 1;
    }

    public static int sumofnode(node root) {
        if(root == null) {
            return 0;
        }

        int leftsum = sumofnode(root.left);
        int rightsum = sumofnode(root.right);

        return leftsum + rightsum + root.data;
    }

    public static int hightofnode(node root) {
        if(root == null) {
            return 0;
        }

        int lefthight = hightofnode(root.left);
        int righthight = hightofnode(root.right);

        if(lefthight > righthight) {
            return lefthight + 1;
        } else {
            return righthight + 1;
        }
    }

    public static int dimeter(node root) {
        if(root == null) {
            return 0;
        }

        int dim1 = dimeter(root.left);
        int dim2 = dimeter(root.right);
        int dim3 = hightofnode(root.left) + hightofnode(root.right) + 1;

        return Math.max(dim1,Math.max(dim2,dim3));
    }

    static class TreeInfo {
        int ht;
        int dim;
        TreeInfo(int ht,int dim) {
            this.ht = ht;
            this.dim = dim;
        }
    }
    public static TreeInfo dimeter2(node root) {
        if(root == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo left = dimeter2(root.left);
        TreeInfo right = dimeter2(root.right);
        
        int myhight = Math.max(left.ht,right.ht) + 1;

        int dim1 = left.dim;
        int dim2 = right.dim;
        int dim3 = left.ht + right.ht + 1;

        int mydim = Math.max(dim1,Math.max(dim2,dim3));

        TreeInfo myInfo = new TreeInfo(myhight, mydim);
        return myInfo;
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        tree Tree = new tree();
        node root = Tree.buildtree(nodes);
        System.out.println("Root data: " + root.data);

        System.out.print("preorder: ");
        preorder(root);
        System.out.print("\ninorder: ");
        inorder(root);
        System.out.print("\npostorder: ");
        postorder(root);
        System.out.println("\nlevelorder: ");
        levelorder(root);
        System.out.print("\ncount of node: ");
        System.out.print(countofnode(root));
        System.out.print("\nsum of node: ");
        System.out.print(sumofnode(root));
        System.out.print("\nhight of node: ");
        System.out.print(hightofnode(root));
        System.out.print("\ndimeter: ");
        System.out.print(dimeter(root));
        System.out.print("\ndimeter2: ");
        System.out.print(dimeter2(root).dim);
    }
}