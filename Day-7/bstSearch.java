class bstSearch{
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
    bstSearch(){
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
   
    int search(Node root,int target){
        if(root!=null){
        if(root.data == target){
            return root.data;
        }else if(target<root.data){
            return search(root.left,target);
        }else{
            return search(root.right,target);
        }
        }return -1;
    }


    public static void main(String[] args){
        bstSearch tree=new bstSearch();
        int target=65;
        tree.root=tree.insert(tree.root,50);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,30);
        tree.root=tree.insert(tree.root,75);
        tree.root=tree.insert(tree.root,65);
        tree.root=tree.insert(tree.root,90);
        System.out.println("Search for 65: ");
        int res=tree.search(tree.root,target);
        if(res==target){
            System.out.println("Element is found");
        }else{
            System.out.println("Element is not found");
        }

    }
}