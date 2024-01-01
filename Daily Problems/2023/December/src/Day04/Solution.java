package Day04;
//2264. Largest 3-Same-Digit Number in String
class Solution {
    public String largestGoodInteger(String num) {
        String result = "";
        for (int i =0;i <num.length()-2;i++){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                if (result.isEmpty() || result.charAt(0) <= num.charAt(i)) result = num.substring(i,i+3);
            }
        }
        return result;
    }
}