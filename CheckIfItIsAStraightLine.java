class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        boolean isStraightLine = true;
        float slope;

        //Checking if the slope of two point are equal       
        slope = getSlope(coordinates[0], coordinates[1]);
        for(int i=1; i<coordinates.length-1; i++){
            if (slope != getSlope(coordinates[i], coordinates[i+1]))
            return false;
        }
        
        return isStraightLine;
    }
    
    //To find slope of two points
    public float getSlope(int[] pointA, int[] pointB){
        return (float)(pointB[1] - pointA[1])/(pointB[0] - pointA[0]);
    }
}