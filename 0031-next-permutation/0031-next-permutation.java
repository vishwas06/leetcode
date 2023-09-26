class Solution {
   
 public void nextPermutation(int[] nums) {
    int index = -1;
    for (int i = nums.length - 2; i >= 0; i--) {
        if (nums[i] < nums[i + 1]) {
            index = i;
            break;
        }
    }
    if (index == -1) {
        reverse(nums, 0);
        return; // Added return to exit the method after reversing
    }

    for (int j = nums.length - 1; j > index; j--) { // Changed 'j>=index' to 'j>index'
        if (nums[j] > nums[index]) {
            swap(nums, j, index);
            break;
        }
    }

    reverse(nums, index + 1);
}

private void swap(int[] nums, int i, int j) { // Changed parameter names from z and t
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

private void reverse(int[] nums, int start) {
    int end = nums.length - 1;
    while (start < end) {
        swap(nums, start, end);
        start++;
        end--;
    }
         }    
    }



   

