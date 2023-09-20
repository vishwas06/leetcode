class Solution {
    public int[] twoSum(int[] nums, int target) {
         int n = nums.length-1;
        int[] sumArr = new int[2];
         for(int i=0; i<n; i++){
             for(int j=i+1; j < nums.length; j++){
                 if(nums[i]+nums[j]==target){
                     sumArr[0]=i;
                     sumArr[1]=j;
                 }
             }
         }
         return sumArr;

//     HashMap <Integer, Integer> map = new HashMap<>();
//     int count=0;
//     for(int i=0; i<nums.length; i++){
//         int temp = nums[i];
//         int diffValue = target - temp;
//         if(map.containsKey(diffValue)){
//             sumArr[count]=map.get(diffValue);
//             count++;
//             sumArr[count]=i;
//             break;
//         }
//         map.put(nums[i], i);
//     }


// return sumArr;
    // int count=0;
    // int n=0;
    // int nEnd= nums.length-1;
    // while(n < nEnd){
    //     int sum = nums[n]+nums[nEnd];
    //     if(sum==target){
    //         sumArr[count]=n;
    //         count++;
    //         sumArr[count]=nEnd;           
    //     }
    //     if(sum<target){
    //     n++;
    //     nEnd--;
    //     }
    // }
 //return sumArr;
    }
}