class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int majorityElement = -1;
        
        //Storing the count in hash map
        for(int num : nums){
            if(!countMap.containsKey(num)){
                countMap.put(num, 1);
            } else{
                countMap.put(num, countMap.get(num)+1);
            }
        }
        
        //Finding the majority element
        int maxCount = 0;        
        for(int key : countMap.keySet()){
            if(countMap.get(key) > maxCount){
                majorityElement = key;
                maxCount = countMap.get(key);
            }
        }
        return majorityElement;
    }
}