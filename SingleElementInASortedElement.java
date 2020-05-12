class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        
        int left = 0,
            right = len-1,
            middle;
        
        while(left<right){
            middle = (left+right)/2;
            if (middle%2==0){
                if (nums[middle] == nums[middle-1]){
                    right = middle - 2;
                } else if (nums[middle] == nums[middle+1]){
                    left = middle + 2;
                } else{
                    return nums[middle];
                }
            } else{
                if (nums[middle] == nums[middle-1]){
                    left = middle + 1;
                } else if (nums[middle] == nums[middle+1]){
                    right = middle - 1;
                } 
            }
        }
        return nums[left];
    }
}