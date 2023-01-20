class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0)return ans; //if there is no row
        // no of row times
        for(int i=1; i<=numRows; i++){
            List<Integer> row = new ArrayList();
            // no of i times
            for(int j=0; j<i; j++){
                if(j==0 || j==i-1){
                    row.add(1);
                }
                else{
                    //outer loop is 1 index based but to get data from ArrayList we have
                    //consider it 0 based index thats why get(i-2) for prev row 
                    row.add(ans.get(i-2).get(j-1)+ans.get(i-2).get(j));
                }
            }
           ans.add(row); 
        }
        return ans;
    }
}