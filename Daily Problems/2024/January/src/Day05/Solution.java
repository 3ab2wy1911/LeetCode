package Day05;
//300. Longest Increasing Subsequence
class Solution {
    public int lengthOfLIS(int[] nums) {
        int result = 0;

        for (int num : nums){
            int l = 0, r = result;
            while (l < r){
                int mid = (l+r) / 2;
                if(nums[mid] < num){
                    l = mid +1;
                }
                else{
                    r = mid;
                }
            }
            nums[l] = num;
            if (l == result) result++;
        }
        return result;
    }
}