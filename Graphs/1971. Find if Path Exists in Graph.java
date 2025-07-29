class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++){
            int v1 = edges[i][0];
            int v2 = edges[i][1];
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        boolean[] vis = new boolean[n];
        return isPath(graph, source, destination, vis);
    }
    public boolean isPath(ArrayList<Integer>[] graph, int src , int dest, boolean[] vis){
        if(src==dest) return true;
        vis[src]=true;
        for(int nbr:graph[src]){
            if(vis[nbr]!=true){
                if(isPath(graph,nbr,dest,vis)) return true;
            }
        }
        return false;
    }
}
