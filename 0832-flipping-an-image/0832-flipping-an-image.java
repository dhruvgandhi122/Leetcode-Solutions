class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int [] row:image){
        //flipping the row array (reversing array)
            for(int i=0;i<(row.length+1)/2;i++){
                int temp =row[i]^1;             //XOR by 1 to get ~ Complement of Array (a^1=~a)
                row[i]=row[row.length-i-1]^1;   //inverting array
                row[row.length-i-1]=temp;
            }
        }
        return image;
    }
}