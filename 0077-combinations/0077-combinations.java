class Solution {
    public List<List<Integer>> combine(int n, int k) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            findUsingBackTracking(i, k, n, list, set);
        }
        List<List<Integer>> res = new ArrayList<>(set);
        
        Collections.sort(res, new Comparator<List<Integer>>(){
            public int compare(List<Integer> o1, List<Integer> o2){
                int n = o1.size() < o2.size() ? o1.size() : o2.size();
                int i=0;
                while(i<n && o1.get(i)==o2.get(i)){
                    i++;
                }
                return Integer.compare(o1.get(i), o2.get(i));
            }
        });
        
        return res;
    }

    private void findUsingBackTracking(int curr, int k, int n, List<Integer> list, Set<List<Integer>> set) {
        if (list.size() > k) {
            return;
        }

        list.add(curr);

        if (list.size() == k) {
            set.add(new ArrayList<>(list));
        }

        for (int i = curr + 1; i <= n; i++) {
            findUsingBackTracking(i, k, n, list, set);
        }
        list.remove(list.size() - 1);
    }
}