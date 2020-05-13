class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        
        if(len == k) return "0";
        if (k == 0) return num;
        
        Stack<Integer> stack = new Stack();
        StringBuilder result = new StringBuilder();
        int number = Character.getNumericValue(num.charAt(0)),
            count = 0;
        
        stack.push(number);
        for (int i=1; i<len; i++){
            number = Character.getNumericValue(num.charAt(i));
            if(stack.isEmpty() || stack.peek()<=number || count==k){
                stack.push(number);
            } else{
                stack.pop();
                i--;
                count++;
            }
        }
        
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
        }
        
        result = new StringBuilder(result.toString().substring(0,len-k));
        while (result.length() !=0 && result.charAt(0)=='0') result.deleteCharAt(0);
        
        if (result.length() == 0) return "0";
        return result.toString();
    }
}