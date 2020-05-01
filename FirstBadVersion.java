/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1,
            end = n,
            middle,
            ans = -1;
        
        while(start <= end){
            middle = start + (end - start) / 2;
            if(isBadVersion(middle)){
                end = middle-1;
                ans = middle;
            } else{
                start = middle+1;
            }
        }
        return ans;
    }
}