class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        for(int n:nums){
            set.add(n);
        }
        List<Integer> disappeared =new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(set.contains(i)){
                continue;
            }else{
                disappeared.add(i);
            }
        }
        return disappeared;
    }
}