class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                int temp=0;
                for(int j=i+1;j<n;j++){
                    temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
                n--;
                i--;
            }
        }
        return nums;
    }
}