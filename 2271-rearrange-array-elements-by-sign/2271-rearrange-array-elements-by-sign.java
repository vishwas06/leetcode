class Solution {
    public int[] rearrangeArray(int[] nums) {
    // List<Integer> pos = new ArrayList<>();
    // List<Integer> neg = new ArrayList<>();

    // for(int i=0; i< nums.length; i++){
    //     if(nums[i]>0){
    //         pos.add(nums[i]);
    //     }else{
    //         neg.add(nums[i]);
    //     }
    // }

    // for(int j=0; j<(nums.length/2); j++){
    //         nums[2*j]=pos.get(j);
    //         nums[2*j+1]=neg.get(j);
    //         }
    int[] arr= new int[nums.length];
    int posIndex=0; int negIndex=1;
    for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                    arr[negIndex] = nums[i];
                    negIndex+=2;
            }else{
                arr[posIndex]=nums[i];
            posIndex+=2;    
        }
    }
    return arr;
    }
}