class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n){
            int correct=nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correct] && n>1){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        int k=0;
        int j=0;
        for(j=1;j<=n;j++){
            if(nums[k]!=j){
                return j;
                
            }
            k++;
        }
        return j;
    }
    public void swap(int []arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}