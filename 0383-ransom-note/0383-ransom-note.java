class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freqran=new int [26];
        int[] freqmag=new int[26];
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            freqran[ch-'a']++;
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            freqmag[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freqmag[i]<freqran[i]){
                return false;
            }
        }
        return true;
    }
}