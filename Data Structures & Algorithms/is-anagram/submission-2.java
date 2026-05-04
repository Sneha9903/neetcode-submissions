class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int n1 = s1.length;
        int n2 = s2.length;
        if (n1!=n2) return false;

        HashMap <Character, Integer> mp = new HashMap<>();

        for (int i=0; i<n1; i++){
            mp.put(s1[i], mp.getOrDefault(s1[i], 0) + 1);
        }

        for (int i=0; i<n2; i++){
            mp.put(s2[i], mp.getOrDefault(s2[i], 0) - 1);
        }

        for (int val : mp.values()){
            if (val!=0) return false;
        }
        return true;
    }
}
