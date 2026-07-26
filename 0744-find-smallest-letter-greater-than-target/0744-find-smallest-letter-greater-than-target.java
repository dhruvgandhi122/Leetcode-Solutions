class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int beg=0;
        int end=(letters.length-1);
        char ciel=letters[0];
        if (target>=letters[end]){
                ciel=letters[0];
                
        }else{
            while(beg<=end){
                int mid=beg +(end-beg)/2;
                
                 
                if(target>=letters[mid]){
                    beg=mid+1;
                }else if (target< letters[mid]){
                    ciel = letters[mid];
                    end=mid-1;
                }
                 
            }    
            
        }   
         return ciel;
    }
}