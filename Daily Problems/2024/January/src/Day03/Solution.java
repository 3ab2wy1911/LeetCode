package Day03;
//2125. Number of Laser Beams in a Bank
class Solution {
    public int numberOfBeams(String[] bank) {
        int previousRow =0 ;
        int result = 0;
        for (String devices : bank){
            int currentRow = 0;
            for (char device : devices.toCharArray()){
                currentRow += (device -'0');
            }
            result += currentRow*previousRow;
            previousRow = currentRow ==0 ? previousRow : currentRow;
        }
        return result;
    }
}