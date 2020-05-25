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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode iterator = root;
        
        for (int i=1; i<preorder.length; i++){
            while (iterator != null){
                if (preorder[i]<iterator.val) {
                    if( iterator.left == null) {
                        iterator.left = new TreeNode(preorder[i]);
                        break;
                    } else{
                        iterator = iterator.left;
                        continue;
                    }
                } 
                
                if (preorder[i]>iterator.val) {
                    if (iterator.right == null) {
                        iterator.right = new TreeNode(preorder[i]);
                        break;
                    } else{
                        iterator = iterator.right;
                        continue;
                    }
                }
            }
            iterator = root;
        }
        return root;
    }
}