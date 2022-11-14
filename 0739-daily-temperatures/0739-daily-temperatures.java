class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] answer = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        for(int i=temperatures.length-1; i>=0; i--){
            while(!st.empty() && temperatures[i]>=temperatures[st.peek()]){
                st.pop();
            }
            if(st.empty()){
                answer[i] = 0;
            }
            else{
                answer[i] = st.peek()-i;
            }
            st.push(i);
        }
        
        return answer;
    }
}