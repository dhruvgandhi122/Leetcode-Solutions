class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map <Integer,Integer> hm = new HashMap<>();
        for(int n: nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int []distinct =new int[hm.size()];
        int []freq =new int [hm.size()];
        int y =0;
        for(Map.Entry<Integer,Integer>l:hm.entrySet()){
            distinct[y]= l.getKey();
            freq[y]= l.getValue();
            y++;
        }
        for(int i=0;i<hm.size();i++){
            for(int j=1;j<hm.size();j++){
                if(freq[j-1]<freq[j]){
                    int temp = freq[j-1];
                    freq[j-1]=freq[j];
                    freq[j]=temp;
                    
                    int temp1 = distinct[j-1];
                    distinct[j-1]=distinct[j];
                    distinct[j]=temp1;
                }
            }
        }
        int ans[] = new int [k];
        for(int i=0;i<k;i++){
            ans[i]=distinct[i];
        }
        return ans;
    }
}