class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){                 //INSERTION SORT
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp =nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        int minproduct= nums[0]*nums[1];
        int maxproduct = nums[n-1]*nums[n-2];
        return maxproduct - minproduct;
    }
}