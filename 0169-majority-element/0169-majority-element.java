class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     int value = map.getOrDefault(nums[i], 0);
        //     map.put(nums[i], value+1);
        // }

        // for(Map.Entry<Integer, Integer> i: map.entrySet()){
        //     if(i.getValue()>(n/2)){
        //         return i.getKey();
        //     }
        // }
        // return -1;

        //Applying moore's voting algorithm

        int count=0;
        int element = 0;

        for(int i=0; i<n; i++){
            if(count==0){
                count=1;
                element=nums[i];
            }else if(nums[i]==element){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int i=0; i<n; i++){
            if(element==nums[i])
            count1++;
        }
        if(count1>(n/2)){
            return element;
        }
        return -1;
    }
}