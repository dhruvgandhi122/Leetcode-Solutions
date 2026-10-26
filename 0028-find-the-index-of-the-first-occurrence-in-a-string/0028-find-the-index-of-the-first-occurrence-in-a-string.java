class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();
        if(m<n){
            return -1;
        }
        if(n==0){
            return 0;
        }
        for(int i=0;i<=m-n;i++){
            boolean equal=true;
            for(int j=0;j<n;j++){
                if(haystack.charAt(j+i)!=needle.charAt(j)){
                    equal=false;
                    break;
                }
            } 
            if(equal){
                return i;
            }
        }
        return -1;
    }
} 
//other method using substring method
// class Solution {
//     public int strStr(String haystack, String needle) {
//         int m = haystack.length();
//         int n = needle.length();

//         for (int i = 0; i <= m - n; i++) {
//             if (haystack.substring(i, i + n).equals(needle)) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }