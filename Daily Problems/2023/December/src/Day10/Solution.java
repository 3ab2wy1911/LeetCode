package Day10;
//867. Transpose Matrix
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int[][] newMatrix = new int [col][row];
        for (int i =0;i<row;i++)
            for(int j=0;j<col;j++)
                newMatrix [j][i] = matrix[i][j];
        return newMatrix;
    }
}
