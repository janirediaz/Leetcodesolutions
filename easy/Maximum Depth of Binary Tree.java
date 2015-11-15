/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int leftDepth = 0;
        int rightDepth = 0;

        if (root == null){
          return 0;  
        } 

        if (root.right != null){
           rightDepth = maxDepth(root.right); 
        } 

        if (root.left != null){
            leftDepth = maxDepth(root.left);
        } 

        return (1 + Math.max(rightDepth, leftDepth));
        
    }
}