package Day6;
//1716. Calculate Money in Leetcode Bank
class Solution {
    public int totalMoney(int n) {
        int a =1, result = 0;
        while(n>0){
            int eq = 2*a+(Math.min(n,7)-1);
            eq = (Math.min(n,7)*eq) / 2;
            result += eq;
            n-=7;
            ++a;
        }
        return result;
    }
}
