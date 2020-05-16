class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int maxSoFar = A[0],
            maxEndingHere = A[0],
            minSoFar = A[0],
            minEndingHere = A[0],
            total = A[0];
        
        for (int i=1, len=A.length; i<len; i++){
            total += A[i];
            
            maxEndingHere = Math.max(maxEndingHere+A[i], A[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
            
            minEndingHere = Math.min(minEndingHere+A[i], A[i]);
            minSoFar = Math.min(minEndingHere, minSoFar);
        }
        
        if (minSoFar == total) return maxSoFar;
        return Math.max(maxSoFar, total-minSoFar);
    }
}