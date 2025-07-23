import java.util.*;
public class dfspath {
    HashMap<Integer,LinkedList<Integer>> hm=new HashMap<>();

    void addVertex(int v){
        hm.putIfAbsent(v,new LinkedList<>());
    }

    void addEdge(int u,int v){
        addVertex(u);
        addVertex(v);
        hm.get(u).add(v);
    }
    void dfs(int start,int end){
        HashSet<Integer> visited=new HashSet<>();

        dfsUtil(start,visited,end);
    }
    void dfsUtil(int curr,HashSet<Integer> visited,int end){
        visited.add(curr);
    
        if(curr==end){
            System.out.println("Path found");
        }else if (curr != end) {
            System.out.println("Not found");
        }
        else{
            System.out.print(curr+" ");
            for(int i:hm.get(curr)){
                if(!visited.contains(i)){
                    dfsUtil(i,visited,end);
                }
            }
        }
    }


    void display(){
        for(int vertex:hm.keySet()){
            System.out.print(vertex+"->");
            for(int edge:hm.get(vertex)){
                System.out.print(edge);
            }
            System.out.println();
        } 
    }
    public static void main(String args[]){
        dfspath g=new dfspath();
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            g.addVertex(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.addEdge(u,v);
        }
        g.display();
        System.out.println("Enter the Start and End to find the path:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        g.dfs(start,end);
    }
}