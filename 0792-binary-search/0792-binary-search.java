class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int res=-1; 
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<target){
                low++;
            }else if(nums[mid]>target){
                high--;
            }else{
             res=mid;
             break;
            }
        }
        if(res>=0){
            return res;
        }
        return res;
    }
}