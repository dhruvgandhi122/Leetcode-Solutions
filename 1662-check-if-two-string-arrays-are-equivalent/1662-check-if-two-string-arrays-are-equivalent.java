class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder res1= new StringBuilder();
        for(String s:word1){
            res1.append(s);
        }
        String finalres1= res1.toString();
        // Other method to join string array using join() fn
        String res2=String.join("",word2);
        if(finalres1.equals(res2)){
            return true;
        }
        return false;
    }
}