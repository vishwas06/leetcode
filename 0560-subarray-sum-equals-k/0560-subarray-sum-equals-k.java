class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length; 
        Map<Integer, Integer> sum = new HashMap<>();
        int preffixSum=0;
        sum.put(0, 1);
        int count=0;
        for(int i=0; i<n; i++){
            preffixSum+=nums[i];

            int remove = preffixSum-k;
            count+=sum.getOrDefault(remove, 0);

        sum.put(preffixSum, sum.getOrDefault(preffixSum, 0)+1);
        }
        return count;
    }
}