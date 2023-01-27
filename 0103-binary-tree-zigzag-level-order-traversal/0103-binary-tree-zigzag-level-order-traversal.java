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
    public List<List<Integer>> zigzagLevelOrder(TreeNode rootPrime) {
        List<List<Integer>> ans = new ArrayList<>();
        if(rootPrime==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(rootPrime);
        boolean ltr = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> lvl = new ArrayList<>(size);
            for(int i=0; i<size; i++){
                TreeNode root = q.poll();
                
                lvl.add(root.val);
                
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            if(!ltr){
                Collections.reverse(lvl);
            }
            ans.add(lvl);
            ltr = !ltr;
        }
        return ans;
    }
}