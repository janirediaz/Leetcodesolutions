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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if (root != null) {
            if (root.left == null && root.right == null) {
                list.add(root.val + "");
            }else{
                if (root.left != null) {
                    list.addAll(binaryTreePaths(root.left));
                }
                if (root.right != null) {
                    list.addAll(binaryTreePaths(root.right));
                }
                for (int i=0;i<list.size();i++) {
                    list.set(i, root.val + "->" +list.get(i));
                }
            }
        }
        return list;
    }
}