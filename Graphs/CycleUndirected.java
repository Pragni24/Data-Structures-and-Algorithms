package Graphs;
//cycle detection in undirected graph
//3 cases hote hai, agar jo tumhara neighbour hai, wo visited hai, but tumhara parent nhi hai, to wha cycle bnti hai
// agar tumhara neighbour visited hai, aur whi tumhara parent bhi hai, to wha cycle nhi hoti, ye case ko hum ignore karte hai
// aur last case, agar tumhara neighbour unvisited hai, to usko visite karke pehle case ki help se find karo,ki usme cycle hai ya nhi,agar hai to true return kar do wanra false

import java.util.ArrayList;

public class CycleUndirected {
    public static class Edge{
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 4));
    }

    public static boolean cycle(ArrayList<Edge> graph[], boolean[] visited, int curr, int par){
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dest]==true && e.dest!=par){
                return true;
            }
            if(!visited[e.dest]){
                if(cycle(graph, visited, e.dest, curr)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge> graph[]=new ArrayList[V];
        boolean visited[] = new boolean[V];
        createGraph(graph);
        System.out.println(cycle(graph, visited, 0, -1));
    }
}
