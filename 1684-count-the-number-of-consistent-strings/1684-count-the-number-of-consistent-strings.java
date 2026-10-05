class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int total=0;
        for(String s: words){
            int count=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(allowed.indexOf(ch)!=-1){
                    count++;
                }
            }
            if(count==s.length()){
                total++;
            }

        }
        return total;
    }
}