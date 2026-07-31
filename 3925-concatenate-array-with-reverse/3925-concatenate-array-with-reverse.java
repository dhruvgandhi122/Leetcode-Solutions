class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int []ans = new int[2*n];
        int k=0;
        for (int i=0;i<n;i++){
            ans[i]=nums[i];
            k =i+1;
            
        }
        
        for(int i=n-1;i>=0;i--){
            ans[k]=nums[i];
            k++;
        }
        return ans;
    }
}