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
        }                              // instead of applying these loops we can also use a simple
        while(n>0){                    //method which gives the no. of digits.
                                       //static int digits(int num){
            n=n/10;                    //    return (int)(Math.log10(num))+1;
            digits++;                  //}
        }
        if(digits%2==0){
            return true;
        }else{
            return false;
        }
    }
}
