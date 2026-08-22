class Solution {
    public void reverseString(char[] s) {
        int n=s.length-1;
        int i=0;
        while(i<n){
            char c= s[n];
            s[n]=s[i];
            s[i]=c;
            n--;
            i++;
        }       
    }
}