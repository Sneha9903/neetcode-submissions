class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);        
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i : mp.keySet()){
            int freq = mp.get(i);
            if (buckets[freq]==null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(i);
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = buckets.length-1; i>=0; i--){
            if (buckets[i]!=null){
                for (int j : buckets[i]){
                    res[index++] = j;
                    if (index==k) return res;
                }
            }
        }
        return res;
    }
}
