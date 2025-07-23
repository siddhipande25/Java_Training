
import java.util.*;
public class graphnumpath {
    HashMap<Integer,LinkedList<Integer>> hm=new HashMap<>();
    int count=0;

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

    void findpath(int start, int end, HashSet<Integer> visited) {
        count = 0; 
        findpathHelper(start, end, visited);
        System.out.println("Total paths found: " + count);
    }

    void findpathHelper(int start, int end, HashSet<Integer> visited) {
        visited.add(start);
        if (start == end) {
            count++;
        } else {
            for (int nbr : hm.get(start)) {
                if (!visited.contains(nbr)) {
                    findpathHelper(nbr, end, visited);
                }
            }
        }
        visited.remove(start);
    }

    public static void main(String args[]){
        graphnumpath g=new graphnumpath();
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
        System.out.println("Enter the start and end node:");
        int start=sc.nextInt();
        int end=sc.nextInt();
        HashSet<Integer> visited=new HashSet<>();
        g.findpath(start,end,visited);

    }
}