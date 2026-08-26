class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = plantedFlowers(flowerbed);
        if(count>=n){
            return true;
        }
        return false;
        
    }
    public int plantedFlowers(int [] nums){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                boolean leftEmpty=(i==0||nums[i-1]==0);
                boolean rightEmpty= (i==nums.length-1||nums[i+1]==0);
                if(leftEmpty && rightEmpty){
                    nums[i]=1;
                    count++;
                }
                    
            }
        }
        return count;
    }
}