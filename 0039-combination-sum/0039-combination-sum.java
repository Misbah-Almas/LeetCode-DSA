class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] a, int target) {
        backtrack(a,target,0,new ArrayList<Integer>());
        return res;
    }
    public void backtrack(int[] a,int target,int removed,ArrayList<Integer> list){
        //failure case
        if(target<0)
            return;
        //success case    
        if(target == 0){
            res.add(new ArrayList(list));
            return;
        }
        //case generation
        for(int i = removed;i<a.length;i++){
            list.add(a[i]);
            backtrack(a,target-a[i],i,list);
            list.remove(list.size()-1);//remove last element
        }
        return;

    }
}