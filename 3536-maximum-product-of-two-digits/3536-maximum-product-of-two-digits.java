class Solution {
    public int maxProduct(int n) {
        int []nums=new int[10];
        int k = nums.length;
        int i=0;
        while(n>0){
            int digit=n%10;
            n=n/10;
            nums[i]=digit;
            i++;
        }
        Arrays.sort(nums);
        return nums[k-1]*nums[k-2];
    }
}