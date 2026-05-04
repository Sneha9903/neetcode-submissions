class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";

        StringBuilder str = new StringBuilder();
        for (String s : strs){
            str.append(s.length()).append('#').append(s);
        }
        return str.toString();
    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();

        int i = 0;
        while (i < str.length()){
            int j = i;

            while (str.charAt(j)!='#') j++;
            
            int l = Integer.parseInt(str.substring(i,j));
            j++;
            ans.add(str.substring(j,j+l));
            i = j + l;
        }
        return ans;
    }
}
