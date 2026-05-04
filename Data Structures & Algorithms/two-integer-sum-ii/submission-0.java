class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length;
        int left = 0;
        int right = l-1;
        int[] ans = new int[2];     

        while (left<right){
            if (numbers[left] + numbers[right] == target){
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }
            else if (numbers[left] + numbers[right] > target){
                right -=1;
            }
            else {
                left+=1;
            }
        }
        return ans;
    }
}
