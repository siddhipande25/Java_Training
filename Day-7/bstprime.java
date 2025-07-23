class bstprime{
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
    bstprime(){
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
   boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    void prime(Node root){
        if(root!=null){
            prime(root.left);
            if(isPrime(root.data)){
                System.out.print(root.data + " ");
            }
            prime(root.right);
        }
    }
    int primesum(Node root){
        int sum=0;
        if(root!=null){
            sum +=primesum(root.left);
            if(isPrime(root.data)){
                sum +=root.data;
            }
            sum +=primesum(root.right);
        }
        return sum;
    }
     
   


    public static void main(String[] args){
        bstprime tree=new bstprime();
        
        tree.root=tree.insert(tree.root,50);
        tree.root=tree.insert(tree.root,20);
        tree.root=tree.insert(tree.root,3);
        tree.root=tree.insert(tree.root,5);
        tree.root=tree.insert(tree.root,7);
        tree.root=tree.insert(tree.root,90);
        tree.prime(tree.root);
        int res=tree.primesum(tree.root);
        System.out.println("\n"+res);


    }
}