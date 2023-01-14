class Solution {

    public int maxProfit(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            int currProfit = arr[i] - min;
            maxProfit = Math.max(maxProfit, currProfit);
        }
        return maxProfit > 0 ? maxProfit : 0;
    }
}
