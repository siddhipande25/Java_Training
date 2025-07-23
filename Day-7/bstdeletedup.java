class bstdeletedup {
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

    bstdeletedup() {
        this.root = null;
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

    public void removeDuplicates() {
        root = removeDuplicatesRec(root);
    }
    private Node removeDuplicatesRec(Node root) {
        if (root == null) {
            return null;
        }
        root.left = removeDuplicatesRec(root.left);
        root.right = removeDuplicatesRec(root.right);
        if (root.right != null && root.data == root.right.data) {
            root.right = delete(root.right, root.right.data);
        }
        return root;
    }

    Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = min(root.right);
            root.right = delete(root.right, root.data);

            // root.data = max(root.left);
            // root.left = delete(root.left, root.data);

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

    int max(Node root) {
        int maximum = root.data;
        while (root.left != null) {
            maximum = root.right.data;
            root = root.right;
        }
        return maximum;
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }
    
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        bstdeletedup tree = new bstdeletedup();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 75);
        tree.root = tree.insert(tree.root, 65);
        tree.root = tree.insert(tree.root, 75); 
        tree.root = tree.insert(tree.root, 90);
        tree.root = tree.insert(tree.root, 20); 
        tree.root = tree.insert(tree.root, 65); 
        tree.root = tree.insert(tree.root, 90);         
        System.out.println("In-order traversal with duplicates:");
        tree.inorder();

        tree.removeDuplicates();

        System.out.println("\nIn-order traversal after removing duplicates:");
        tree.inorder();


        //       50
        //      /  \
        //     /    \
        //    20      75
        //     \     /  \
        //     20   65    75
        //           \   /  \
        //           65     90
                            // \
                            // 90
    }
}