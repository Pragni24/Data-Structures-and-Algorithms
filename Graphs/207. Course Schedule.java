class Solution {
    public static boolean dfs(List<List<Integer>> list, int[] inStack, int[] visited, int i){
        if(inStack[i]==1){
            return true;
        }
        if(visited[i]==1){
            return false;
        }
        inStack[i]=1;
        visited[i]=1;
        for(int n:list.get(i)){
            if(dfs(list,inStack,visited,n)){
                return true;
            }
        }
        inStack[i]=0;
        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] arr:prerequisites){
            list.get(arr[0]).add(arr[1]);
        }
        int inStack[] = new int[numCourses];
        int visited[] = new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(dfs(list,inStack,visited,i)){
                return false;
            }
        }
        return true;
    }
}
