package Day02;

import java.util.ArrayList;
import java.util.List;

//2610. Convert an Array Into a 2D Array With Conditions

class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int [] arr= new int [nums.length+1];
        List<List<Integer>> list = new ArrayList<>();

        for (int num : nums){
            arr[num]++;
            if(list.size() <arr[num]){
                list.add(new ArrayList<>());
            }
            list.get(arr[num]-1).add(num);
        }

        return list;
    }
}
