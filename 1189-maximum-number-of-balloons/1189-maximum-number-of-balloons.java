class Solution {
    public int maxNumberOfBalloons(String text) {
        // balloon contains b=1
        //                  a=1
        //                  l=2
        //                  o=2
        //                  n=1
        Map<Character,Integer> hm=new HashMap<>();
        for(char ch:text.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        if(hm.get('b')==null){
            hm.put('b',0);
        }
        if(hm.get('a')==null){
            hm.put('a',0);
        }
        if(hm.get('l')==null){
            hm.put('l',0);
        }
        if(hm.get('o')==null){
            hm.put('o',0);
        }
        if(hm.get('n')==null){
            hm.put('n',0);
        }
        int countb=hm.get('b');
        int counta= hm.get('a');
        int countl=hm.get('l')/2;
        int counto=hm.get('o')/2;
        int countn=hm.get('n');
        int print=10000;
        if(print>countb){
            print=countb;
        }
        if(print>counta){
            print=counta;
        }
        if(print>countl){
            print=countl;
        }
        if(print>counto){
            print=counto;
        }
        if(print>countn){
            print=countn;
        }
        return print;
    }
}