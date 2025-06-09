class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                count++;

            } else {
                i++;
            }
        }
        return nums.length-count;
    }
}
