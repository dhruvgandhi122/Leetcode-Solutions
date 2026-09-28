class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>res =new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            char[] arr =word.toCharArray();
            for(char c: arr){
                if(c==x){
                    res.add(i);
                    break;
                }
            }
        }
        return res;
    }
}