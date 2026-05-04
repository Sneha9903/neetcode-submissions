class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while (l < r){
            if (nums[l] < nums[r]){
                break;
            }
            int mid = l + (r - l)/2;
            if (nums[mid] < nums[r]){
                r = mid;
            }else l = mid + 1;
        }
        int pivot = l;
        int left,right;
        if (target >= nums[pivot] && target <= nums[nums.length - 1]){
            left = pivot;
            right = nums.length-1;
        }else{
            left = 0;
            right = pivot - 1;
        }

        while (left<=right){
            int m = left + (right - left)/2;
            if (nums[m] == target){
                return m;
            }
            else if(nums[m]>target){
                right = m - 1;
            }
            else {
                left = m + 1;
            }
        }
        return -1;
    }
}
