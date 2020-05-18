class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];
        
        for(int i=0;i<s1.length();i++){
            map[s1.charAt(i) - 'a']++;
        }
    
        int windowStart = 0;
        int windowEnd = 0;
        while(windowEnd<s2.length()){
            if(map[s2.charAt(windowEnd) - 'a'] > 0){
                map[s2.charAt(windowEnd++) - 'a']--;
                if(windowEnd-windowStart ==  s1.length()){                    
                    return true;
                }
            }
            else if(windowStart == windowEnd){
                windowStart ++;
                windowEnd ++;
            }
            else{
                map[s2.charAt(windowStart++) - 'a']++;
            }      
        }
        return false;
    }
}