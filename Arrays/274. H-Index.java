class Solution {
    public int hIndex(int[] citations) {
        int hInd=0;
        int n=citations.length;
        Arrays.sort(citations);
        for(int i=0;i<citations.length;i++){
            int h = n-i;
            if(citations[i]>=h){
                return h;
            }
        }
        return hInd;
    }
}
