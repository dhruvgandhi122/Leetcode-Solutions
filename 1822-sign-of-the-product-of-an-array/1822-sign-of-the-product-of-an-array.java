class Solution {
    public int arraySign(int[] nums) {
        int product =1;
        for(int n: nums){
            if (n == 0) return 0; // Quick exit: anything * 0 is 0
            if (n < 0) product *= -1; // Multiply by -1 instead of the full number
            // we are not multiplying fully bcoz it will exceed the 2^32 integer limit
        }
        return signFunc(product);
    }
    public int signFunc(int product){
        if(product>0){
            return 1;
        }else if(product<0){
            return -1;
        }
        return 0;
    }
}