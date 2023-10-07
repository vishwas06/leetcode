class Solution {
    static int findDays(int [] weights, int cap){
            int days=1;
            int load=0;
            for(int i=0; i<weights.length; i++){
                if(weights[i]+load > cap){
                    days++;
                    load=weights[i];
                }else{
                    load+=weights[i];
                }
            }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<weights.length; i++){
            sum+=weights[i];
            max=Math.max(max, weights[i]);
        }


        while(max<=sum){
                int mid=(sum+max)/2;
                int ldays=findDays(weights, mid);
            if(ldays<=days){
                sum=mid-1;
            }else{
                max=mid+1;
            }
        }
        return max;
    }
}