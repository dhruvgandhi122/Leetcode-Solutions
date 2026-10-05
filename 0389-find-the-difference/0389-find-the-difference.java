class Solution {
    public char findTheDifference(String s, String t) {
        int freqs[]=new int[26];
        int freqt[]=new int[26];
        for(int j=0;j<s.length();j++){
            char c =s.charAt(j);
            freqs[c-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            freqt[ch-'a']++;
            if(s.indexOf(ch)==-1 || freqs[ch-'a']<freqt[ch-'a']){
                return ch;
            }
        }
        return ' ';
    }
}