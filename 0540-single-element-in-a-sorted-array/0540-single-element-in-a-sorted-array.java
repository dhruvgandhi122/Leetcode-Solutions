import java.util.*;
class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>k:hm.entrySet()){
            if(k.getValue()==1){
                return k.getKey();
            }
        }
        return -1;
    }
}