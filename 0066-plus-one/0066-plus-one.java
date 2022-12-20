class Solution {
    public int[] plusOne(int[] digits) {
        Stack<Integer> ans = new Stack<>();
        int n = digits.length;
        int temp = digits[n-1] + 1;
        ans.push(temp%10);
        int carry = temp/10;
        for(int i=n-2; i>=0; i--){
            temp = digits[i]+carry;
            ans.push(temp%10);
            carry = temp/10;
        }
        if(carry!=0)ans.push(carry);
        int[] arr = new int[ans.size()];
        int i=0;
        while(!ans.empty()){
            arr[i] = ans.peek();
            ans.pop();
            i++;
        }
        return arr;
    }
}