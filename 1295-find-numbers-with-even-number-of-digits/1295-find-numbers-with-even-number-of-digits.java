class Solution {
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            if(noOfDigits(n)){
                count++;
            }
        }
        return count;
    }
    public  static boolean noOfDigits(int n){
        int digits=0;
        if(n==0){    
            digits=1;
        }
        if(n<0){
            n=n*-1;
        }
        while(n>0){
            n=n/10;
            digits++;
        }
        if(digits%2==0){
            return true;
        }else{
            return false;
        }
    }
}