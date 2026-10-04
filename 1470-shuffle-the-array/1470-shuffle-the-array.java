class Solution {
    public int[] shuffle(int[] nums, int n) {
        int []shuffled= new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
            shuffled [k]=nums[i];
            shuffled[k+1]=nums[n+i];
            k+=2;
        }
        return shuffled;
    }
}