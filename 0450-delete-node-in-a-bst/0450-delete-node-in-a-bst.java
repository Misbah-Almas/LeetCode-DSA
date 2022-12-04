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
    
    int bringMax(TreeNode root)
    {
        TreeNode temp = root;
        while(temp.right != null) {
            temp = temp.right;
        }

        return temp.val;
    }

    
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null) return null;
    
        if(root.val == key) {

            // 1. 0-child
            if(root.left == null && root.right == null) return null;

            // 2. 1-child i.e; left
            if(root.left != null && root.right == null) return root.left;

            // 3. 1-child i.e; right
            if(root.left == null && root.right != null) return root.right;

            // 4. 2-child
            int leftSubtreeMax = bringMax(root.left);
            root.val = leftSubtreeMax;
            root.left = deleteNode(root.left, leftSubtreeMax);

        }

        else if(key < root.val) root.left = deleteNode(root.left, key);
        else root.right = deleteNode(root.right, key);

        return root;

    }
}