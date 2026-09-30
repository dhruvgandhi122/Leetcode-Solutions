import java.util.*;
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer>hm =new HashMap<>();
        for(int i: arr1){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int k=0;
        int[] res=new int[arr1.length];
        for(int n: arr2){
            if(hm.containsKey(n)){
                int count=hm.get(n);
                hm.remove(n);
                for(int q=0;q<count;q++){
                    res[k]=n;
                    k++;
                }
            }
        }
        int sort[]=new int [hm.size()];
        int l=0;
        for(int j:hm.keySet()){
            sort[l]=j;
            l++;
        }
        Arrays.sort(sort);
        for (int n : sort) {
            int count = hm.get(n);
            for (int q = 0; q < count; q++) { 
                res[k] = n;
                k++;
            }
        }
        return res;
    }
}