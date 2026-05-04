class Solution {

    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList();
        backtrack(nums, target, 0, curr);
        return result;
    }

    private void backtrack(int[] nums, int target, int i, List<Integer> curr){
        if (target==0){
            result.add(new ArrayList<>(curr));
            return;
        }     
        if (target<0 || i>=nums.length) return;

        curr.add(nums[i]);
        backtrack(nums, target-nums[i], i, curr);
        curr.remove(curr.size()-1);
        backtrack(nums, target, i+1, curr);
    }
}
