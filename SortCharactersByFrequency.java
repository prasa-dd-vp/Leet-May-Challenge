class Solution {
    public String frequencySort(String s) {
        int[] freqArr = new int[256];
        
        for (char c : s.toCharArray()){
            freqArr[c]++;
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freqArr[b] - freqArr[a]);
        for(int i = 0; i < 256; i++){
            pq.offer((char)i);
        }
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Character c = pq.poll();
            for(int i = 0; i < freqArr[c]; i++){
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
