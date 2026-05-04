/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    private int maxDaimeter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        depth(root);
        return maxDaimeter;
    }
    private int depth(TreeNode root){
        int c = 0;
        if (root == null) return c;
        int l = depth(root.left);
        int r = depth(root.right);
        maxDaimeter = Math.max(maxDaimeter, l+r);
        return (1 + Math.max(l,r));
        
    }
}
