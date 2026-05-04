class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int longest = 0;
        for (int i:nums){
            st.add(i);
        }
        for (int i : nums){
            int curr = 0;
            if (!st.contains(i+1)){
                int k = i;
                while (st.contains(k)){
                    curr += 1;
                    k -=1;
                }
            }
            if (curr>longest){
                longest = curr;
            }
        }
        return longest;
    }
}
