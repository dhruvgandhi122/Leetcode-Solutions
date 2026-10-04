class Solution {
    public boolean isPalindrome(String s) {
        if(s.isBlank()){
            return true;
        }
        int n =s.length();
        StringBuilder sb=new StringBuilder();
        
        for(char ch:s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String cleaned=sb.toString().toLowerCase();
        int start=0;
        int end=cleaned.length()-1;
        while(start<=end){
            if(cleaned.charAt(start)==(cleaned.charAt(end))){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}