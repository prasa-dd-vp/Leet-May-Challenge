class Solution {
    public int findComplement(int num) {
        int result = 0, power = 0, bit;
        
        while(num>0){
            bit = num % 2;
            bit = (bit == 0) ?1 :0;
            result += bit * Math.pow(2, power++);
            num = num/2;
        }
        
        return result;
    }
}