class Solution {
    public void rotate(int[][] a) {
        int n = a[0].length;
        for(int i=0; i<n/2; i++){
            for(int j=i; j<n-1-i; j++){
                int temp = a[i][j];
                a[i][j] = a[n-1-j][i];
                a[n-1-j][i] = a[n-1-i][n-1-j];
                a[n-1-i][n-1-j] = a[j][n-1-i];
                a[j][n-1-i] = temp;
            }
        }
    }    
}
// Brute force approach will give TLE
// class Solution {
//     public void rotate(int[][] a) {
//         int n = a[0].length;
//         for(int i=0; i<n; i++){
//             for(int j=i; j<n; j++){
//                 int temp = a[i][j];
//                 a[i][j] = a[j][i];
//                 a[j][i] = a[i][j];
//             }
//         }
//         for(int i=0; i<n; i++){
//             reverse(a[i]);
//         }
//     }
    
//     private void reverse(int[] arr){
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//     }
// }