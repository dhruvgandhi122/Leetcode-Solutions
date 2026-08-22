class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(s.equals(reverseString(s))){
                return s;
            }
        }
        return "";
    }
    public String reverseString(String s){
        char[]ch=s.toCharArray();
        int n =s.length();
        for (int i=0;i<n/2;i++){
            char k=ch[n-i-1];
            ch[n-i-1]=ch[i];
            ch[i]=k;
        }
        return String.valueOf(ch);
    }
}