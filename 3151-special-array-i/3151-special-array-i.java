class Solution {
    public boolean isArraySpecial(int[] arr) {
        int n = arr.length;
        if(n==1){
            return true;
        }

        for(int i=0;i<n-1;i++){
            if (arr[i]%2==0){
                if(arr[i+1]%2==0){
                    return false ;
                }else{
                    continue;
                }
            }else if(arr[i]%2==1){
                if(arr[i+1]%2==0){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}