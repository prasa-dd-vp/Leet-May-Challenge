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
    public boolean isCousins(TreeNode root, int x, int y) {
        boolean result = false;
        
        int[] xData = new int[2];
        int[] yData = new int[2];
        
        xData = getParentAndDepth(root, x, 1, root.val);
        yData = getParentAndDepth(root, y, 1, root.val);
        
        if(xData[0] != yData[0] && xData[1] == yData[1]){
            result = true;
        }
        
        return result;
    }
    
    public int[] getParentAndDepth(TreeNode root, int value, int level, int parent){
        int[] parentDepthArr = new int[2];
        
        if (root == null){
            parentDepthArr[0] = -1;
            parentDepthArr[1] = -1;
            return parentDepthArr;
        }

        if (root.val == value){
            parentDepthArr[0] = parent;
            parentDepthArr[1] = level;
            return parentDepthArr; 
        }
        parent = root.val;
        
        parentDepthArr = getParentAndDepth(root.left, value, level+1, parent);
        
        if (parentDepthArr[0] != -1){
            return parentDepthArr;
        }
        
        parentDepthArr = getParentAndDepth(root.right, value, level+1, parent);
        
        return parentDepthArr;
        
    }
}