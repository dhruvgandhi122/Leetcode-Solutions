class Solution {
    public int[] runningSum(int[] nums) {
        int sum=0;
        int i =0;
        for(int n: nums){
            sum =n+sum;
            nums[i]=sum;
            i++;
        }
        return nums;
    }
}