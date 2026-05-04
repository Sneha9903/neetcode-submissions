class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0 ;
        int l = heights.length;
        // int p1 = 0
        // int p2 = l-1;

        for (int i=0; i<l-1; i++){
            for (int j=i+1; j<l; j++){
                maxArea = Math.max(maxArea, (Math.min(heights[i],heights[j])*(j-i)));
            }
        }return maxArea;
    }
}
