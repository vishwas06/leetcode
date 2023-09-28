class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
        return 0;
       int n =nums.length; 
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(nums[i]);
        } 

        int longest=1;
        for(int v : set){
        if(!set.contains(v-1)){
            int cnt=1;
            int x=v;
            while(set.contains(x+1)){
                x=x+1;
                cnt+=1;
            }
        longest=Math.max(longest, cnt);
        }
        }
        return longest;
    }
}