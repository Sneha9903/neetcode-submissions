class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        char[] a = new char[26];
        for (char i : s.toCharArray()) a[i-'a']++;
        for (char i : t.toCharArray()) a[i-'a']--;
        for (int i = 0; i<26; i++) {
            if (a[i]!=0) return false;
        }
        return true;
    }
}
