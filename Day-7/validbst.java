
class ValidBST {
    class Node {
        int data;
        Node left, right;
        Node(int d) {
            data = d;
        }
    }

    Node root;
    Node prev = null; 

    Node insert(Node root, int val) {
        if (root == null) return new Node(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    
    boolean isValidBST(Node root) {
        if (root == null) return true;

        if (!isValidBST(root.left)) return false;

        
        if (prev != null && root.data <= prev.data) return false;
        prev = root;

        
        return isValidBST(root.right);
    }

    public static void main(String[] args) {
        ValidBST tree = new ValidBST();
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 75);

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);

        System.out.println("\nIs valid BST: " + tree.isValidBST(tree.root));
    }
}


