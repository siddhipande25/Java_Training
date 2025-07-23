import java.util.*;
public class dfsgraph {
    HashMap<Integer,LinkedList<Integer>> hm=new HashMap<>();

    void addVertex(int v){
        hm.putIfAbsent(v,new LinkedList<>());
    }

    void addEdge(int u,int v){
        addVertex(u);
        addVertex(v);
        hm.get(u).add(v);
        hm.get(v).add(u);
    }
    void dfs(int start){
        HashSet<Integer> visited=new HashSet<>();
        dfsUtil(start,visited);
    }
    void dfsUtil(int curr,HashSet<Integer> visited){
        visited.add(curr);
        System.out.print(curr+" ");
        for(int i:hm.get(curr)){
            if(!visited.contains(i)){
                dfsUtil(i,visited);
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
    void delete(int v){
        hm.remove(v);
    }
    public static void main(String args[]){
        dfsgraph g=new dfsgraph();
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
        g.dfs(1);
        System.out.println("\nEnter the vertex to be delete:");
        int v=sc.nextInt();
        g.delete(v);
        g.display();
    }
}