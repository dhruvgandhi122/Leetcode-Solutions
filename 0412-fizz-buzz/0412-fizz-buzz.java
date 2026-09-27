class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        String []answer=new String[n];
        int k=0;
        for(int i=1;i<=n;i++){
            answer[k]=String.valueOf(i);    //create int i to String 
            k++;
            if (i%3==0 && i%5==0){
                answer[i-1]="FizzBuzz";
            }else if(i%3==0){
                answer[i-1]="Fizz";
            }else if(i%5==0){
                answer[i-1]="Buzz";
            }
        }
        for(String g:answer){
            list.add(g);
        }
        return list;
    }
}