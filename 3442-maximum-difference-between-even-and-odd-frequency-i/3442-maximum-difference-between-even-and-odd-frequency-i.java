class Solution {
    public int maxDifference(String s) {
        Map<Character,Integer> hm = new HashMap<>(26);
        for(char ch: s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int max=-1;
        int min=1000;
        for(Map.Entry<Character,Integer>k:hm.entrySet()){
            int g=k.getValue();
            if(g>max && g%2!=0){
                max=g;
            }
            if(g<min && g%2==0){
                min=g;
            }
        }
        return max-min;
    }
}