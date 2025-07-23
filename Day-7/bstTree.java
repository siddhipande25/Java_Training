class bstTree{
    Node root;
    class Node{
        int data;
        Node left, right;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    bstTree(){
        this.root=null;
    }
    Node insert(Node root,int val){
        Node newNode=new Node(val);
        if(root == null){
            root=newNode;
        }else if(val<root.data){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    Node delete(Node root,int val){
        
        if(root == null){
            return null;
        }else if(val<root.data){
            root.left=delete(root.left,val);
        }else if(val>root.data){
            root.right=delete(root.right,val);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                root.data=min(root.right);
                root.right=delete(root.right,root.data);
            }
        }
        return root;
    }
    int min(Node root){
        int minimum=root.data;
        while(root.left != null){
            minimum=root.left.data;
            // root=root.left;
        }
     return minimum;
    }
    void inorder(Node root ){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    // void preorder(Node root){
    //     if(root!=null){
    //         System.out.print(root.data+" ");
    //         preorder(root.left);
    //         preorder(root.right);
    //     }
    // }
    // void postorder(Node root){
    //     if(root!=null){
    //         postorder(root.left);
    //         postorder(root.right);
    //         System.out.print(root.data+" ");
    //     }
    // }

    public static void main(String[] args){
        bstTree tree=new bstTree();
        tree.root=tree.insert(tree.root,50);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,30);
        tree.root=tree.insert(tree.root,75);
        tree.root=tree.insert(tree.root,65);
        tree.root=tree.insert(tree.root,90);
        System.out.println("Inorder Traversal: ");
        tree.inorder(tree.root);
        // System.out.println("\n Preorder Traversal: ");
        // tree.preorder(tree.root);
        // System.out.println("\n Postorder Traversal: ");
        // tree.postorder(tree.root);
        tree.root=tree.delete(tree.root,30);
        System.out.println("\nInorder Traversal after deletion: ");
        tree.inorder(tree.root);


    }
}