import java.util.*;
public class ungraph {
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
        ungraph g=new ungraph();
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
        System.out.println("\nEnter the vertex to be delete:");
        int v=sc.nextInt();
        g.delete(v);
        g.display();
    }
}