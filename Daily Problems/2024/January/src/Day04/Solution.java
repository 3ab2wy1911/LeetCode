package Day04;

import java.util.HashMap;

//2870. Minimum Number of Operations to Make Array Empty
class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int result = 0;

        for (int num : nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }

        for (var key : mp.keySet()){
            int val = mp.get(key);
            if(val < 2){
                return -1;
            }
            result += val / 3;
            if(val%3 !=0 ){
                result++;
            }
        }
        return result;
    }
}