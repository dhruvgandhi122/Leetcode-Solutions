import java.util.*;
import java.lang.Math;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>hm =new HashMap<>();
        for(int n :nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int maxKey=nums[0];
        int maxCount=0;
        for(Map.Entry<Integer,Integer> hp: hm.entrySet()){
            if(hp.getValue()>maxCount){
                maxCount=hp.getValue();
                maxKey=hp.getKey();
            }
        }
        return maxKey;
    }
}