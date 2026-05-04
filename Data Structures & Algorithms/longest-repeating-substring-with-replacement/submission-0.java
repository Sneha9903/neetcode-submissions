class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int r = 0;
        int maxFreq = 0;
        int maxLen = 0;

        HashMap<Character, Integer> seen = new HashMap<>();

        while (r < s.length()) {
            char val = s.charAt(r);
            seen.put(val, seen.getOrDefault(val, 0) + 1);
            maxFreq = Math.max(maxFreq, seen.get(val));

            // shrink window
            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);
                seen.put(leftChar, seen.get(leftChar) - 1);
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }

        return maxLen;
    }
}