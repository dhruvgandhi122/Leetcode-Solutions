class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]==target){
                list.add(k);
            }
        }
        return list;
    }
    public static void swap(int nums[],int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}