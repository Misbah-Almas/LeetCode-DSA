class Solution {
    public String largestNumber(int[] arr) {
        
        int n = arr.length;
        String[] s = new String[n];
        
        for(int i=0; i<n; i++){
            s[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();

        for(String str : s){
            sb.append(str);
        }

        return sb.toString().startsWith("0") ? "0" : sb.toString();          
    }
}