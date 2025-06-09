class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0]=bsearch(nums,target,true);
        ans[1]=bsearch(nums,target,false);
        return ans;
    }
    int bsearch(int[] nums,int target,boolean findFirst){
        int ans=-1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target){
                low=mid+1;;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                ans=mid;
                if(findFirst){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return ans;
    }

}
