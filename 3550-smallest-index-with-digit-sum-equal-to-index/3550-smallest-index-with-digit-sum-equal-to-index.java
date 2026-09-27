class Solution {
    public int smallestIndex(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(i==digitSum(nums[i])){
                return i;
            }
        }
        return -1;
    }
    public int digitSum(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem;
        }
        return sum;
    }
}