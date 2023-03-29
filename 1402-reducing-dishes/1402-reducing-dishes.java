class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        //System.out.print(Arrays.toString(satisfaction));
        int neg = 0;
        int pos = 0;
        for(int i : satisfaction){
            if(i<0)
                neg += Math.abs(i);
            else
                pos += i;
        }
        
        int s = 0;
        while(s<satisfaction.length && neg >= pos){
            neg = neg + satisfaction[s];
            s++;
        }
        int m=1;
        int ans = 0;
        for(int i=s; i<satisfaction.length; i++){
            //System.out.print(satisfaction[s]);
            ans += satisfaction[i]*m;
            m++;
        }
        
        return ans;
    }
}