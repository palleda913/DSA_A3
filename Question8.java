package in.ineuron;

import java.util.Arrays;

public class Question8 {
    public static boolean checkWhetherAttend(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // Overlaps checking
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean result = checkWhetherAttend(intervals);
        System.out.println(result);
    }
}