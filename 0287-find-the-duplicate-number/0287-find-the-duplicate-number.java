class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>k:hm.entrySet()){
            if(k.getValue()>=2){
                return k.getKey();
            }
        }
        return -1;
    }
}