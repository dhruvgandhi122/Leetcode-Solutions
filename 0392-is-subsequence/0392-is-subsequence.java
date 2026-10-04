class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int n=s.length();
        if(s.isBlank()){
            return true;
        }
        StringBuilder sb= new StringBuilder(t);
        for(int j=0;j<sb.length();j++){
            if(s.charAt(i)==sb.charAt(j)){
                i++;
                if(i>=n){
                    i--;
                }
            }else{
                sb.deleteCharAt(j);
                j--;
            }
        }
        String res=sb.toString();
        if(s.equals(res)){
            return true;
        }
        return false;
    }
}