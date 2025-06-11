class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return ways(n,map);        
    }
    public int ways(int n,HashMap<Integer,Integer> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int totalways=0;
        int left = ways(n-1,map);
        int right = ways(n-2,map);
        map.put(n,left+right);
        return left+right;
    }
}
