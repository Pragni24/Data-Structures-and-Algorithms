class Solution {
    public boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        if(n==2||n==3){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        while(n!=0 && !set.contains(n)){
            set.add(n);
            int sum=0;
            while(n!=0){
                int r = n%10;
                sum=sum+r*r;
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            return true;
        }

        return false;
        
    }
}
