class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int sum;
            if(nums[i]<=0){
                sum=nums[i];
                max = Math.max(sum, max);
            }else{
                sum=nums[i];
                 max = Math.max(sum, max);
            }
            for(int j=i+1; j<n; j++){
                sum=sum*nums[j];
                max=Math.max(max, sum);
            }
        }
        return max;
    }
}