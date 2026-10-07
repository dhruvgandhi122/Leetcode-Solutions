class Solution {
    public int maxScore(String s) {
        int left=0;
        int max=0;
        for(int j=0;j<s.length();j++){   
            int right =left+1;
            int totalscore=0; 
            for(int i=0;i<s.length();i++){

                if(i<=left && s.charAt(i)=='0' ){
                    totalscore++;

                }
                if(i>left && s.charAt(i)=='1' ){
                    totalscore++;
                }
            }
            if(totalscore>max){
                max=totalscore;
            }
            left++;
            if(left==s.length()-1){
                break;
            }
        }
        return max;
    }
}