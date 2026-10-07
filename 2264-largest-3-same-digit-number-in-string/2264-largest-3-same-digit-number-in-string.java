class Solution {
    public String largestGoodInteger(String num) {
        if(num.length()<3){
            return "";
        }
        List<Integer> nums=new ArrayList<>();
        int max=-1; 
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1)&& num.charAt(i)==num.charAt(i+2)){
                int k=Character.getNumericValue(num.charAt(i));
                nums.add(k);
            }
        }
        for(int n:nums){
            if(n>max){
                max=n;
            }
        }
        if(max==-1){
            return "";
        }
        String result =String.valueOf(max).repeat(3);
        return result;
    }
}