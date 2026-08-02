class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        int totalSum=(n*(n+1))/2;
        for (int i:nums){
            sum=sum+i;
        }
        int missingNumber = totalSum - sum;
        return missingNumber;

    }
}