class Solution {
    public int totalMoney(int n) {
        int amount=0;
        int prevMonday=0;
        int deposit =0;
        for(int i=0;i<n;i++){
            if(i%7==0){
                deposit=prevMonday+1;
                prevMonday=deposit;
            }else{
                deposit++;
            }
            amount+=deposit;
        }
        return amount;
    }
}