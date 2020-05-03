class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] alphabetCounter = new int[26];
        
        //Increasing magazine's character count
        for (char character : magazine.toCharArray()){
            alphabetCounter[character - 'a']++;
        }
        
        //Checking if ransom note is present in magazine letters
        for(char character: ransomNote.toCharArray()){
            if(alphabetCounter[character - 'a']-1 >= 0){
                alphabetCounter[character - 'a']--;
            } else{
                return false;
            }
        }
        
        return true;
    }
}