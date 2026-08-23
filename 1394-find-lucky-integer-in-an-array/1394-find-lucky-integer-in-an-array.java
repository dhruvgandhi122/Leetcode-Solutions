import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        int max=-1;
        Map <Integer,Integer> hm= new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);    
        }
        for(Map.Entry<Integer,Integer> K: hm.entrySet()){
            if(K.getKey().equals(K.getValue())){
                int lucky=K.getKey();
                if(lucky>max){
                    max=lucky;
                }
            }
        }
        return max;
    }
}