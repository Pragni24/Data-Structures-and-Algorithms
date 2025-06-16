class Solution {
    public int countGoodSubstrings(String s) {
        char[] a=s.toCharArray();
        int c=0;
        for(int i=0;i<a.length-2;i++){
            if(a[i]!=a[i+1]&&a[i]!=a[i+2]&&a[i+1]!=a[i+2])
            c++;
        }
        return c;
    }
}
