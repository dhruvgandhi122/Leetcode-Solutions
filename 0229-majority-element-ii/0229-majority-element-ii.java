class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n=nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>k: hm.entrySet()){
            if((k.getValue())>((int)n/3)){
                res.add(k.getKey());
            }
        }
        return res;
    }
}