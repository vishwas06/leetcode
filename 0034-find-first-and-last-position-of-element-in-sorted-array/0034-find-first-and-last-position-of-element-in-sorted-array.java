class Solution {

    private int firstAndSecondOccurence(int[] nums, int target, boolean startIndex){
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                res=mid;
                if(startIndex){
                high=mid-1;
                }else{
                    low=mid+1;
                }
            }else if(nums[mid]<target){
                low++;
            }else{
                high--;
            }
        }
        return res;
    } 

    public int[] searchRange(int[] nums, int target) {
        int[] arr= {-1, -1};
       int firstOcc=firstAndSecondOccurence(nums, target, true);
       int secondOcc=firstAndSecondOccurence(nums, target, false);
        arr[0]=firstOcc;
        arr[1]=secondOcc;
        return arr;
    }
}