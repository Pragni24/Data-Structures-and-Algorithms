class Solution {
    public static boolean dfs(List<List<Integer>> list, int[] inStack, int[] visited, Stack<Integer> stack,int i){
        if(inStack[i]==1){
            return true;
        }
        if(visited[i]==1){
            return false;
        }
        inStack[i]=1;
        visited[i]=1;
        for(int n:list.get(i)){
            if(dfs(list,inStack,visited,stack,n)){
                return true;
            }
        }
        inStack[i]=0;
        stack.push(i);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] arr:prerequisites){
            list.get(arr[1]).add(arr[0]);
        }
        int inStack[] = new int[numCourses];
        int visited[] = new int[numCourses];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<numCourses;i++){
            if(visited[i]==0){
                if(dfs(list,inStack,visited,stack,i)){
                    return new int[0];
                }
            }
        }
        int[] order = new int[numCourses];
        int i=0;
        while(!stack.isEmpty()){
            order[i]=stack.pop();
            i++;
        }
        return order;
    }
}
