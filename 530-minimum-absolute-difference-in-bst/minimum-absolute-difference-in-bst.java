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
        int minu=Integer.MAX_VALUE;
        TreeNode prev=null;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minu;
    }
    TreeNode inorder(TreeNode root){
        if(root==null)return root;
        inorder(root.left);
        if(prev!=null){
            minu=Math.min(minu,root.val-prev.val);
        }
        prev=root; 
        inorder(root.right);
        return root;
    }
}