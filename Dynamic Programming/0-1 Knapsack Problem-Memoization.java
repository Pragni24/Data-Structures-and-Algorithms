class Solution {
    //memoization
    static int[][] t = new int[1001][1001];
    public void initializeArray() {
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
    }
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        Solution solution = new Solution();
        solution.initializeArray();
        int n=val.length;
        return helper(W,val,wt,n);
    }
    static int helper(int W, int[] val, int[] wt, int n){
        if(n==0 || W==0){
            return 0;
        }
        if(t[n][W]!=-1){
            return t[n][W];
        }
        if(wt[n-1]<=W){
            return t[n][W] = Math.max(val[n-1]+helper(W-wt[n-1],val,wt,n-1),helper(W,val,wt,n-1));
        }
        return t[n][W]= helper(W,val,wt,n-1);
        
    }
    
}
