class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] trustedByArr = new int[N];
        int[] trustingArr = new int[N];
        int i;
        for (i=0; i<trust.length; i++){
            trustingArr[trust[i][0]-1]++;
            trustedByArr[trust[i][1]-1]++;
        }
        
        for (i=0; i<trustedByArr.length; i++){
            if(trustedByArr[i] == N-1){
                if (trustingArr[i] == 0){
                    return i+1;    
                } else{
                    return -1;
                }
            } 
        }
        
        return -1;
    }
}