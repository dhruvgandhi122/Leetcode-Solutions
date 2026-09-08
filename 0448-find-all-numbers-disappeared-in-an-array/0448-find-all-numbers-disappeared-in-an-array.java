class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int k=nums.length;
        HashSet<Integer> set = new HashSet<>(); 
        for(int n:nums){
            set.add(n);
        }
        List<Integer> disappeared =new ArrayList<>();
        for(int i=1;i<=k;i++){
            if(set.contains(i)){
                continue;
            }else{
                disappeared.add(i);
            }
        }
        return disappeared;
    }
}