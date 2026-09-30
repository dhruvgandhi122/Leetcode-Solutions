class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>k:hm.entrySet()){
            if(k.getValue()==1){
                return k.getKey();

            }
        }
        return -1;
    }
}