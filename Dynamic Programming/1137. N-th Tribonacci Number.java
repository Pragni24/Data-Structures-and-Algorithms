class Solution {
    public int tribonacci(int n) {
        HashMap<Integer,Integer> map= new HashMap<>();
        return tribo(n,map);
    }
    public int tribo(int n, HashMap<Integer,Integer> map){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n==0){
            map.put(n,0);
            return 0;
        }
        if(n==1){
            map.put(n,1);
            return 1;
        }
        if(n==2){
            map.put(n,1);
            return 1;
        }
        
        int m = tribo(n-1,map)+tribo(n-2,map)+tribo(n-3,map);
        map.put(n,m);
        return m;
    }
}
