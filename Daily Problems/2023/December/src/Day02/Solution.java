package Day02;
//1160. Find Words That Can Be Formed by Characters
class Solution {
    public int countCharacters(String[] words, String chars) {

        int [] freq = new int[26];
        for (char c : chars.toCharArray()){
            freq[c-'a']++;
        }

        int cnt = 0;
        for (String word : words){
            int [] arr = new int[26];
            System.arraycopy(freq, 0, arr, 0,26);
            int count = 0;
            for (char c : word.toCharArray()){
                if (arr[c-'a'] == 0){
                    break;
                }
                ++count;
                arr[c-'a']--;
            }
            if (count == word.length()) cnt+=count;
        }
        return cnt;
    }
}
