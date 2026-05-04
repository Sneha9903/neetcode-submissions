class Solution {
    public int trap(int[] height) {

        int l = height.length;
        int[] preM = new int[l];
        int[] postM = new int[l];

        int maxS = height[0];
        int maxE = height[l-1];

        for (int i=0; i<l; i++){
            maxS = Math.max(maxS,height[i]);
            preM[i] = maxS;
        }
        for (int i = l-1; i>=0; i--){
            maxE = Math.max(maxE,height[i]);
            postM[i] = maxE;
        }
        int water = 0;
        for (int i = 0; i < l; i++) {
            water += Math.min(preM[i], postM[i]) - height[i];
        }

        return water;
    }
}
