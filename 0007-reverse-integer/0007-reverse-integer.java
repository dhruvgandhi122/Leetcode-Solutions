class Solution {
    public int reverse(int x) {
        int rem=0;
        long res=0;
        while (x!=0){
            rem=x%10;
            res=(res*10)+rem;
            x=x/10;
            
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
                return 0;
        }
        return (int) res;
    }
}