class Solution {
    public boolean isPalindrome(int x) {
        int ans =x;
        int rev =0;
        while(x>0){
            int mod=x%10;
            rev=rev*10+mod;
            x=x/10;
            
        }
        if (ans==rev){
            return true;
        }else{
            return false;
        }
    }
}