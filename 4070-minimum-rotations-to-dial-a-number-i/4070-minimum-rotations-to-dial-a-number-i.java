import java.lang.Math;
class Solution {
    public int minRotations(String s) {
        int totalRotation=0;
        int current =0;
        for (int i=0;i<s.length();i++){
            int target=s.charAt(i)-'0';
            int diff =Math.abs(target-current);
            int rot= Math.min(diff,10-diff);
            totalRotation+=rot;
            current= target;
        }
        return totalRotation;
    }
}