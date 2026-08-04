class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
        //sorting Array 
        Arrays.sort(v);
        //accessing first and last character of  array
        char [] first =v[0].toCharArray();
        char [] last =v[v.length-1].toCharArray();
        //comparing first and last String
        for ( int i =0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            ans.append(first[i]);
        }
        return ans.toString();
    }
}
