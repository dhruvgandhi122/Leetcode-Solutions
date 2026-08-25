class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String s:details){
            if(seniorCitizen(s)){
                count++;
            }
        }
        return count; 
    }
    public boolean seniorCitizen(String s){
        int num1=Character.getNumericValue(s.charAt(11));
        int num2=Character.getNumericValue(s.charAt(12));
        int age =(num1*10)+num2;
        if(age>60){
            return true;
        }
        return false;
    }
}