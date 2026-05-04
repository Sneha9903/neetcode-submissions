class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "");
        String s2 = s1.toLowerCase();
        char[] arr = s2.toCharArray();
        
        int l = arr.length;
        for (int i=0; i<l/2; i++){
            if (arr[i]!=arr[l-1-i]){
                return false;
              }
        }
        return true;
    }
}
