class Solution {
    public int[] finalPrices(int[] prices) {
        int ans[]=new int [prices.length];
        for(int i=0;i<prices.length;i++){
            int price=prices[i];
            for(int j=0;j<prices.length;j++){
                if(j>i && prices[j]<=prices[i]){
                    price-=prices[j];
                    break;
                }
            }
            ans[i]=price;
        }
        return ans;
    }
}