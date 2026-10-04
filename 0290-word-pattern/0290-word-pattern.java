class Solution {
    public boolean wordPattern(String pattern, String s) {
        Set<Character>setP= new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            setP.add(pattern.charAt(i));
        }
        int n=pattern.length();
        int lenP=setP.size();
        Set<String>setS= new HashSet<>();
        String nums[] =s.split(" ");
        int n1=nums.length;
        for(String k:nums){
            setS.add(k);
        }
        //Create a set of combined pairs: "char -> word"
        Set<String>Mapping=new HashSet<>();
        if(n!=n1){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            Mapping.add(pattern.charAt(i)+"->"+nums[i]);
        }
        int Map=Mapping.size();
        int lenS=setS.size();
        if(n==n1 && lenP==lenS && Map==lenS){
            return true;
        }
        return false;
    }
} 