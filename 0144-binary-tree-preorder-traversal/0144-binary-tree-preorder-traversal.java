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
    // private void preOrder(TreeNode root, List<Integer> ans){
    //     if(root==null) return;
    //     ans.add(root.val);
    //     preOrder(root.left, ans);
    //     preOrder(root.right, ans);
    // }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        // preOrder(root, ans);
        // return ans;
        //Morris preOrder..
        TreeNode curr = root;
        while(curr != null){
            if(curr.left==null){
            ans.add(curr.val);
            curr = curr.right;
        }
        else{
            TreeNode leftNode = curr.left;
            TreeNode rightMostNode = rightMost(leftNode, curr.val);
            if(rightMostNode.right==null){
                ans.add(curr.val);
                rightMostNode.right = curr;
                curr = curr.left;
            }
            else{
                rightMostNode.right=null;
                curr = curr.right;
            }
        }
      }
        return ans;
    }
    
    private TreeNode rightMost(TreeNode root, int k){
        while(root.right != null && root.right.val!= k){
            root = root.right;
        }
        return root;
    }
}