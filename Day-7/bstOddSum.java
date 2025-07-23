class bstOddSum{
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
    bstOddSum(){
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
    int  oddsum(Node root ){
        int sum=0;
        if(root != null){
           sum+= oddsum(root.left);
                if(root.data%2 != 0){
                    sum+=root.data;
                }
            sum+=oddsum(root.right);
        }
        return sum;
    }
   


    public static void main(String[] args){
        bstOddSum tree=new bstOddSum();
        
        tree.root=tree.insert(tree.root,50);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,30);
        tree.root=tree.insert(tree.root,75);
        tree.root=tree.insert(tree.root,65);
        tree.root=tree.insert(tree.root,90);
        int res=tree.oddsum(tree.root);
        System.out.println(res);


    }
}