class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        int row =searchRow(matrix,target);
        if(row ==-1){
            return false;
        }
        if(binarySearchInRow(matrix,target,row)){
            return true;
        }
        return false;
    }
    public boolean binarySearchInRow(int[][]matrix,int target,int row){
        int start=0;
        int end= matrix[row].length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target== matrix[row][mid]){
                return true;
            }else if(target < matrix[row][mid]){
                end=mid-1;
            }else if (target> matrix[row][mid]){
                start =mid+1;
            }
        }
        return false;
    }


    public int searchRow(int[][] matrix,int target){
        int start=0;
        int end=matrix.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target<matrix[mid][0]){
                end=mid-1;
            }else if (target>matrix[mid][matrix[mid].length-1]){
                start =mid+1;
                
            }else if (target>=matrix[mid][0] && target<=matrix[mid][matrix[mid].length-1]){
                return mid;
            }
        }
        return-1;
    }
}