class Solution {
    public int search(int[] nums, int target) {
      int point=0;
        if(nums[0]<=nums[nums.length-1]) point =0;
        else point=BSpoint(nums);
        int l=point;
        int h=nums.length-1;
        int brr=BS(nums,l,h,target);
        if(brr!=-1) return brr;
        l=0;
        h=point-1;
        return BS(nums,l,h,target);
    }
    int BS(int[] nums,int l,int h,int target){
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return -1;
    }
    int BSpoint(int[] nums){
        int l=0;
        int h=nums.length-1;
        int n=nums.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>nums[n-1] && mid<(n-1) && nums[mid]>nums[mid+1]){
                return mid+1;
            }
            else if(nums[mid]>nums[n-1]){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return 0;
    }
}