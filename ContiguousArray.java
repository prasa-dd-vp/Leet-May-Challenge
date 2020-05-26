class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0,
            max = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<Integer, Integer>();
        
        sumIndexMap.put(0,-1);
        for (int i=0; i<nums.length; i++){
            sum += (nums[i] == 0) ?-1 :1;
            if (sumIndexMap.containsKey(sum)){
                max = Math.max(max, i-sumIndexMap.get(sum));
            } else {
                sumIndexMap.put(sum, i);
            }
        }
        return max;
    }
}