
class bstheight {

    Node root;
    class Node {
        int data;
        Node left, right;

        Node(int d) {
            this.data = d;
        }
    }

    bstheight() {
        root = null;
    }

    Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }


    public int height() {
        return findHeight(root);
    }

   
    int findHeight(Node node) {
        if (node == null) return -1; 
        int leftHeight = findHeight(node.left);
        int rightHeight = findHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

     public int level() {
        return findlevel(root);
    }

   
    int findlevel(Node node) {
        if (node == null) return 0; 
        int leftHeight = findlevel(node.left);
        int rightHeight = findlevel(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        bstheight tree = new bstheight();

        
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        int treeHeight = tree.height();
        System.out.println("The height of the BST is: " + treeHeight); 

        tree.root = tree.insert(tree.root, 90);
        System.out.println("After inserting 90, the new height is: " + tree.height()); 

        int treelevel = tree.level();
        System.out.println("The level of the BST is: " + treelevel); 
    }
}
