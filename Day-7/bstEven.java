class bstEven{
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
    bstEven(){
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
    void inorder(Node root ){
        if(root != null){
         inorder(root.left);
        if(root.data%2 == 0){
            System.out.print(root.data+" "); 
        }
        inorder(root.right);
        }
    }
   


    public static void main(String[] args){
        bstEven tree=new bstEven();
        
        tree.root=tree.insert(tree.root,50);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,30);
        tree.root=tree.insert(tree.root,75);
        tree.root=tree.insert(tree.root,65);
        tree.root=tree.insert(tree.root,90);
        tree.inorder(tree.root);


    }
}