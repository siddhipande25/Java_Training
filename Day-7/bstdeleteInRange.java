import java.util.*;

class bstdeleteInRange {
    Node root;

    class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    bstdeleteInRange() {
        this.root = null;
    }


    Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

  
    Node deleteNode(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.data) {
            root.left = deleteNode(root.left, val);
        } else if (val > root.data) {
            root.right = deleteNode(root.right, val);
        } else {
            
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
           
            root.data = min(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    Node deleteInRange(Node root, int a, int b) {
        for (int i = a; i <= b; i++) {
            root = deleteNode(root, i);
        }
        return root;
    }


    int min(Node root) {
        int minimum = root.data;
        while (root.left != null) {
            minimum = root.left.data;
            root = root.left; 
        }
        return minimum;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        bstdeleteInRange tree = new bstdeleteInRange();
        Scanner sc = new Scanner(System.in);
        
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 75);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 65);

        System.out.println("Original Inorder Traversal:");
        tree.inorder(tree.root); 
        System.out.println();

        System.out.println("\nEnter the range to delete (a and b):");
        int a = sc.nextInt();
        int b = sc.nextInt();
        tree.root = tree.deleteInRange(tree.root, a, b);
        
        System.out.println("\nInorder Traversal after deletion:");
        tree.inorder(tree.root);
        System.out.println();
    }
}