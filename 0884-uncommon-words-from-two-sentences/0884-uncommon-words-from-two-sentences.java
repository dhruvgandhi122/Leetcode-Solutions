class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        List<String> res = new ArrayList<>();
        Map<String,Integer> hm =new HashMap<>();
        for(String s:arr1){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String i:arr2){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<String,Integer> l:hm.entrySet()){
            if(l.getValue()==1){
                res.add(l.getKey());
            }
        }
        return res.toArray(new String[0]);
    }
}