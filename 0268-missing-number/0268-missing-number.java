class Solution {
    public int missingNumber(int[] nums) {
        // int n = nums.length;
        // int sum=0;
        // int totalSum=(n*(n+1))/2;
        // for (int i:nums){
        //     sum=sum+i;
        // }
        // int missingNumber = totalSum - sum;
        // return missingNumber;
    
        //WE CAN ALSO DO THIS USING CYCLESORT
        int n=nums.length;
        int i=0;
        while(i<n){
            int correct =nums[i];
            if(nums[i]<n && nums[i]!=nums[correct]){
                int temp =nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return n;
    }
}