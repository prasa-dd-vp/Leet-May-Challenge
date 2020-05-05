class Solution {
    public int firstUniqChar(String s) {
        int[] alphabetCountArray = new int[26];
        
        //Storing the count of letters in the string in an array
        for (char character : s.toCharArray()){
            alphabetCountArray[character - 'a']++;
        }
        
        //Finding the first unique character in the string
        for (char character : s.toCharArray()){
            if (alphabetCountArray[character - 'a'] == 1){
                return s.indexOf(character);
            }
        }
        
        return -1;
    }
}