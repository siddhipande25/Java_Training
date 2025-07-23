import java.util.*;
class bstbound{
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
    bstbound(){
            this.root=null;
    }

    Node insert(Node root,int val){
        Node nNode=new Node(val);
        if(root==null){
            root=nNode;
        }
        else if(val<root.data){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    } 
    
    void printBoundary(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        printLeftBoundary(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printRightBoundary(root.right);

    }
    void printLeaves(Node root){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            System.out.print(root.data + " ");
            return ;
        }
        printLeaves(root.left);
        printLeaves(root.right);
    }

    void printLeftBoundary(Node root){
        if(root==null){
            return ;
        }
        if(root.left!=null){
            System.out.print(root.data + " ");
            printLeftBoundary(root.left);
        }else if(root.right!=null){
            System.out.print(root.data + " ");
            printLeftBoundary(root.right);
        }
    }   
     void printRightBoundary(Node root){
        if(root==null){
            return ;
        }
        if(root.right!=null){
            System.out.print(root.data + " ");
            printRightBoundary(root.right);
        }else if(root.left!=null){
            System.out.print(root.data + " ");
            printRightBoundary(root.left);
        }
    }   
      

  
    public static void main(String[] args) {
        bstbound t=new bstbound();
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of elements you want to insert in tree:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter the element:");
            int ele=sc.nextInt();
            t.root=t.insert(t.root,ele);
        }
      
        System.out.println("Boundary Traversal of the tree is:");
        t.printBoundary(t.root);       

    }
}