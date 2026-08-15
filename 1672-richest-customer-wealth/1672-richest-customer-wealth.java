class Solution {
    public int maximumWealth(int[][] accounts) {
        int[]wealth =new int[accounts.length];
        int k =0;
        for(int i =0;i<accounts.length;i++){
            int sum =0;
            for(int j=0;j<accounts[i].length;j++){
                sum=sum+accounts[i][j];
            }
            wealth [k]=sum;
            k++;
        }
        int maxWealth=wealth[0];
        for (int l=0;l<wealth.length;l++){
            if(maxWealth < wealth[l]){
                maxWealth=wealth[l];
            }
        }
        return maxWealth;
    }
}