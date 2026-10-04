class Solution {
    public List<String> stringMatching(String[] words) {
        int n=words.length;
        List<String>list =new ArrayList<>(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(words[i].contains(words[j])){
                    if(!list.contains(words[j])){
                        list.add(words[j]);
                        
                    }
                }
                if(words[j].contains(words[i])){
                    if(!list.contains(words[i])){
                        list.add(words[i]);  
                    }
                }
            }
        }
        return list;
    }
}