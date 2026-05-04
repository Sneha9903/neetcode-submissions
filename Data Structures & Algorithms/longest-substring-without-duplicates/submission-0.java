class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0;
        int r = 0;
        int curr = 0;
        int maxl = 0;
        char[] s1 = s.toCharArray();

        Set<Character> st = new HashSet<>();

        while (r<n){
            while (st.contains(s1[r])){
                st.remove(s1[l]);
                l+=1;
                curr-=1;
            }  
            st.add(s1[r]);
            r+=1;
            curr+=1;
            maxl = Math.max(maxl,curr);            
        }
        return maxl;
    }
}