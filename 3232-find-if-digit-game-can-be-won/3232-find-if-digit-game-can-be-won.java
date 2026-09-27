class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int n:nums){
            if(noOfDigits(n)==1){
                sum1=sum1+n;
            }else if(noOfDigits(n)==2){
                sum2=sum2+n;
            }
        }
        if(sum1>sum2 || sum2>sum1){
            return true;
        }
        return false;
    }
    public int noOfDigits(int n){
        int digit=0;
        if(n==0){
            return 1;
        }
        while(n>0){
            n=n/10;
            digit++;
        }
        
        return digit;
    }
}