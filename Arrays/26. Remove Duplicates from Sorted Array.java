class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int i=1;
        while(i<nums.length){
            if(nums[i]!=nums[j-1]){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}
