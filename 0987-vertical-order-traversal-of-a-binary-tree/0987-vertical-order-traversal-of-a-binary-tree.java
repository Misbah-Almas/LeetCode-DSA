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
    //veritical traversal but if two node is in same hd and lvl then uning pq to get that
    //in sorted order otherwise use map<Integer, List<Integer>>...
    public List<List<Integer>> verticalTraversal(TreeNode rootPrime) {
        Queue<Tuple> q = new LinkedList<Tuple>();
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        q.add(new Tuple(0, 0, rootPrime));
        while(!q.isEmpty()){
            Tuple tuple = q.poll();
            
            TreeNode root = tuple.root;
            int x = tuple.hd;
            int y = tuple.lvl;
            
            if(!map.containsKey(x)){
                map.put(x, new TreeMap<>());
            }
            
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y, new PriorityQueue<>());
            }
            
            map.get(x).get(y).add(root.val);
            
            if(root.left != null)
                q.add(new Tuple(x-1, y+1, root.left));
            
            if(root.right != null)
                q.add(new Tuple(x+1, y+1, root.right));
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> map2 : map.values()){
            List<Integer> temp = new ArrayList();
            for(PriorityQueue<Integer> pq : map2.values()){
                while(!pq.isEmpty()){
                    temp.add(pq.poll());
                }
            }
            ans.add(temp);
        }
        return ans;
    }
}

class Tuple{
    TreeNode root;
    int hd;
    int lvl;
    public Tuple(int hd, int lvl, TreeNode root){
        this.hd = hd;
        this.lvl = lvl;
        this.root = root;
    }
}