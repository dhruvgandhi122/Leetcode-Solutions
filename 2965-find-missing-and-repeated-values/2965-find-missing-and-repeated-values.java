class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> hm =new HashMap<>();
        for(int[] arr : grid){
            for(int i: arr){
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
        }
        int n=grid.length;
        int res[]=new int[2];
        for(Map.Entry<Integer,Integer> l: hm.entrySet()){
            if(l.getValue()==2){
                res[0]=l.getKey();
            }          
        }
        for(int k=1;k<=n*n;k++){
            if(!hm.containsKey(k)){
                res[1]=k;
            }
        }
        return res;
    }
}