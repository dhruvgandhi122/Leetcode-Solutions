import java.util.*;
class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        int sum = 0;
        int even = 1; // Initial prefix sum 0 is even
        int odd = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[j];
            if (sum % 2 != 0) {
                count = (count + even) % 1000000007;//Without taking % 1000000007, the answer would overflow a normal int
                odd++;
            } else {
                count = (count + odd) % 1000000007;
                even++;
            }
        }
        return count;
    }
}
//this method is used to get All Subarrays of an array but in this question it is exteding memory limit so not using it.

/*
    public int[][] getAllSubarrays(int []arr){
        int n=arr.length;
        //Formula to Calculate total noOfSubarrays Of an Array
        int totalSubarrays= n*(n+1)/2;
        int sol[][]=new int [totalSubarrays][];
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                // copyOfRange end index is exclusive, so use j + 1
                sol[index++]=Arrays.copyOfRange(arr,i,j+1);
            }
        }
        return sol;
    }
    */