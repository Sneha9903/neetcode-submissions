class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(current, 0, nums, result);
        return result;

    }

    private void backtrack(List<Integer> current, int i, int[] nums, List<List<Integer>> result){
        if (i>=nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        backtrack(current, i+1, nums, result);
        current.remove(current.size()-1);
        backtrack(current, i+1, nums, result);
    }
}  