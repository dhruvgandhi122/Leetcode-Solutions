class Solution {
    public int countCharacters(String[] words, String chars) {
        int total=0;
        int freqchars[] =new int[26];
        for(int i=0;i<chars.length();i++){
            char c =chars.charAt(i);
            freqchars[c-'a']++;
        }
        for(String s: words){
            int count=0;
            int[]freqs =new int[26];
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(chars.indexOf(ch)!=-1){
                    count++;
                    freqs[ch-'a']++;
                }
            }
            boolean isequivalent=true;
            for(int j=0;j<26;j++){
                if(freqchars[j]<freqs[j]){
                    isequivalent =false;
                }
            }
            if(count ==s.length() && isequivalent ==true){
                    total+=count;
            }

        }
        return total;
    }
}