//We can do this question by using HashMap or Switch() Method


class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer>hm =new HashMap <>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int sum=0;
        int current = hm.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int next = hm.get(s.charAt(i));
            if(current < next){
                sum -=current;  
            }else{
                sum+=current;
            }
            current=next;
        }
        sum+=current;
        return sum;
    }
}