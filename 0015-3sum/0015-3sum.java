class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        //List<Integer> temp =null;
        int firstNum=nums.length-1;
        int secondNum =nums.length;
        for(int i=0; i<firstNum; i++){
            Set<Integer> haSet =new HashSet<>();
            for(int j=i+1; j<secondNum; j++){
                    int thirdValue= -(nums[i]+nums[j]);
                        if(haSet.contains(thirdValue)){
                            List<Integer> list = Arrays.asList(nums[i], nums[j], thirdValue);
                            list.sort(null);
                            set.add(list);
                        }
                        haSet.add(nums[j]);
                    }
        }
            List<List<Integer>> ans = new ArrayList<>(set);
            
       return ans;
    }
}