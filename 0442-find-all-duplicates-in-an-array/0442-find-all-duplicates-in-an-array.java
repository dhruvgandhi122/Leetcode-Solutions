class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        //Applying Cycle Sort
        int n= nums.length;
        int i=0;
        while(i<n){
            int correct =nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //Checking Duplicates
        List<Integer> list =new ArrayList<>();
        for(int j=0;j<n;j++){
            int correct=j+1;
            if(nums[j]!=correct){
                list.add(nums[j]);
            }
        }
        return list;
    }
    public void swap(int[] nums,int i,int j){
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}