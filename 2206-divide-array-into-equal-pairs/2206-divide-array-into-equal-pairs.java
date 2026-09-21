// If the frequency of element is not even then it's pair cannot be formed.
class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer>hm= new HashMap<>();
        for(int n: nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Integer i:hm.values()){
            if(i%2!=0){
                return false;
            }
        }
        return true;
    }
}