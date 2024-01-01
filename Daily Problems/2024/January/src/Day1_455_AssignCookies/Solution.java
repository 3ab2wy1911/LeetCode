package Day1_455_AssignCookies;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int cnt =0;
        int ck = s.length-1 , cd = g.length-1;
        while(cd>=0 && ck>=0){
            if(g[cd]<=s[ck]){
                --ck;
                ++cnt;
            }
            --cd;
        }
        return cnt;
    }
}