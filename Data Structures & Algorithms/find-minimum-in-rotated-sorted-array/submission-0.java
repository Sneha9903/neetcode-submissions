class Solution {
    public int findMin(int[] nums) {
        int minNum = nums[0];
        int l = nums.length;
        for (int i=1; i<l; i++){
            if (nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return minNum;
    }
}
