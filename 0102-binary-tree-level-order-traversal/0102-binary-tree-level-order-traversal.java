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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root==null) return ans;
        q.offer(root);
        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> currLevel = new ArrayList<>();
            while(s-->0){
            TreeNode curr = q.poll();
            currLevel.add(curr.val);
            if(curr.left != null) q.offer(curr.left);
            if(curr.right != null) q.offer(curr.right);
            }
            ans.add(currLevel);
        }
        return ans;
    }
}