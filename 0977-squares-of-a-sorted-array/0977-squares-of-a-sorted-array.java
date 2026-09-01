class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        for(int k=0;k<n;k++){
            nums[k]=nums[k]*nums[k];
        }
        for(int i=0;i<n;i++){
            boolean swapped =false;
            for(int j=1;j<n-i;j++){
                if(nums[j]<nums[j-1]){
                    int temp =nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                    swapped =true;
                }
            }
            if(swapped!=true){
                break;
            }
        }
        
        return nums;
    }
}