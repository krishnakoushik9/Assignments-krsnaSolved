package krsnaSolved;

import java.util.ArrayList;
import java.util.Arrays;

public class Q56 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,8},{2,4}};
        int[][] ans = merge(intervals);
        System.out.println(Arrays.deepToString(ans));
    }
    public static int[][] merge(int[][] intervals) {
        // [1,3],[2,6] == [1,6]
        // Logic = end(1) > start(2)
        // merge start(1) & end(2)
        //(int[][] intervals)
        ArrayList<int[]> merged = new ArrayList<>();
        sort(intervals);
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentEnd) {
                currentEnd = Math.max(currentEnd, intervals[i][1]);
            } else {
                merged.add(new int[] {currentStart, currentEnd});
                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }
        merged.add(new int[] {currentStart, currentEnd});
        return merged.toArray(new int[merged.size()][]);
    }
    public static int[][] sort(int[][] intervals) {
        int j = 0;
        int i;
        for (i = 0; i < intervals.length; i++) {
            for (j = i + 1; j < intervals.length; j++) {
                if (intervals[i][0] > intervals[j][0]) {
                    swap(intervals, i, j);
                }
            }
        }
        return intervals;
    }
    public static int[] swap(int[][] intervals, int a, int b){
        int[] temp = intervals[a];
        intervals[a] = intervals[b];
        intervals[b] = temp;
        return new int[] {};
    }
}
