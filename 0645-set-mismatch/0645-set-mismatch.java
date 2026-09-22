class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int n: nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int arr[]= new int[2];
        for(Map.Entry<Integer,Integer>k:hm.entrySet()){
            if(k.getValue()==2){
                arr[0]=k.getKey();
                break;
            }
        }
         for (int i = 1; i <= nums.length; i++) {
            if (!hm.containsKey(i)) {
                arr[1] = i;
                break; 
            }
        }
        return arr;
        
    }
}