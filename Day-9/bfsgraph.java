
import java.util.*;
public class bfsgraph {
    HashMap<Integer,LinkedList<Integer>> hm=new HashMap<>();

    void addVertex(int v){
        hm.putIfAbsent(v,new LinkedList<>());
    }

    void addEdge(int u,int v){
        addVertex(u);
        addVertex(v);
        hm.get(u).add(v);
    }

    void display(){
        for(int vertex:hm.keySet()){
            System.out.print(vertex+"->");
            for(int edge:hm.get(vertex)){
                System.out.print(edge+" ");
            }
            System.out.println();
        } 
    }

    void bfs(int start){
        HashSet<Integer> visited=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        visited.add(start);
        q.add(start);
        bfsHelper(q,visited);
    }

    void bfsHelper(Queue<Integer> q,HashSet<Integer> visited){
        if(q.isEmpty()){
            return;
        }
        int curr=q.remove();
        System.out.print(curr+" ");
        for(int nbr:hm.get(curr)){
            if(!visited.contains(nbr)){
                visited.add(nbr);
                q.add(nbr);
            }
        }
        bfsHelper(q,visited);
    }
    public static void main(String args[]){
        bfsgraph g=new bfsgraph();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            g.addVertex(sc.nextInt());
        }
        int e=sc.nextInt();
        for(int i=0;i<e;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            g.addEdge(u,v);
        }
        g.display();
        g.bfs(3);
    }
}