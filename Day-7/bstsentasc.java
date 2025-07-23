import java.util.*;

class bstsentasc {
    Node root;

    class Node {
        String data;
        Node left, right;

        Node(String d) {
            this.data = d;
            this.left = null;
            this.right = null;
        }
    }

    bstsentasc() {
        this.root = null;
    }

    Node insert(Node root, String word) {
        if (root == null) {
            return new Node(word);
        } else if (word.compareTo(root.data) < 0) {
            root.left = insert(root.left, word);
        } else {
            root.right = insert(root.right, word);
        }
        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        bstsentasc tree = new bstsentasc();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        for (String word : words) {
            tree.root = tree.insert(tree.root, word.toLowerCase()); 
        }

        System.out.println("Words in sorted order:");
        tree.inorder(tree.root);
    }
}
//manual way

    // public static void main(String[] args) {
    //     BstWordManualSplit tree = new BstWordManualSplit();
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a sentence:");

    //     String word = "";
    //     for (int i = 0; i < sentence.length(); i++) {
    //         char ch = sentence.charAt(i);

    //         if (ch != ' ') {
    //             word += ch;
    //         }

    //         // At space or end of string, insert the word
    //         if (ch == ' ' || i == sentence.length() - 1) {
    //             if (!word.equals("")) {
    //                 tree.root = tree.insert(tree.root, word);
    //                 word = ""; // reset word
    //             }
    //         }
    //     }

    //     System.out.println("Words in sorted order:");
    //     tree.inorder(tree.root);
    // }

