
import java.util.*;
class bstbsf{
    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int d){
            this.data=d;
            this.left=null;
            this.right=null;
        }
    }
    bstbsf(){
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
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    // void bfs(Node root){
    //     Queue<Node> q=new LinkedList<>();
    //     q.add(root);
    //     if(q.isEmpty()){
    //         return;
    //     }
    //     while(!q.isEmpty()){
    //         Node curr=q.remove();
    //         System.out.println(curr+" ");
    //         if(curr.left!=null){
    //             q.add(curr.left);
    //         }
    //         if(curr.right!=null){
    //             q.add(curr.right);
    //         }
    //     }
    // }

   void bfs(Node root){
        HashSet<Node> visited=new HashSet<>();
        Queue<Node> q=new LinkedList<>();
        visited.add(root);
        q.add(root);
        bfsHelper(q,visited);
    }

    void bfsHelper(Queue<Node> q,HashSet<Node> visited){
        if(q.isEmpty()){
            return;
        }
        Node curr=q.remove();
        System.out.print(curr.data+" ");
        if(curr.left!=null && !visited.contains(curr.left)){
            visited.add(curr.left);
            q.add(curr.left);
        }
        if(curr.right!=null && !visited.contains(curr.right)){
            visited.add(curr.right);
            q.add(curr.right);
        }
        bfsHelper(q,visited);
    }
    public static void main(String args[]){
        bstbsf tree=new bstbsf();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int val=sc.nextInt();
            tree.root=tree.insert(tree.root,val);
        }
        tree.bfs(tree.root);
    }
}





























































