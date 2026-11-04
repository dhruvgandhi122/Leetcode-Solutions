class Solution {
    public boolean checkPerfectNumber(int num) {
        
        int result =0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                result+= i;
            }
            if(result> num){
                return false;
            }
        }
        if(result == num){
            return true;
        }
        return false;
    }
}