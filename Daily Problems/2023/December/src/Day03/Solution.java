package Day03;
//1266. Minimum Time Visiting All Points
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int time = 0 , n = points.length;
        for (int i =0 ; i <n-1; i++) time += Math.max(Math.abs(points[i][0] - points[i+1][0]), Math.abs(points[i][1] - points[i+1][1]));
        return time;
    }
}
