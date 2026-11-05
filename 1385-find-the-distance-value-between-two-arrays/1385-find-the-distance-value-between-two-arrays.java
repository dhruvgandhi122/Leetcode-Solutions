import java.lang.Math;
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int result =0;
        for(int n: arr1){
            int count=0;
            for(int i=0;i<arr2.length;i++){
                if(Math.abs(n-arr2[i])<=d){                //here we have to find the absolute difference
                    count++;
                }
            }
            if(count==0){
                result++;
            }
        }
        return result;
    }
}