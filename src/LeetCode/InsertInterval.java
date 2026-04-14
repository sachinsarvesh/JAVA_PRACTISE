package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args){
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        System.out.println(Arrays.deepToString(insertInterval(intervals, newInterval)));


    }

    private static int[][] insertInterval(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();
        int i =0;
        int n = intervals.length;

        // Before merge
        while(i<n && intervals[i][1]<newInterval[0]){
            result.add(intervals[i]);
            i++;
        }


        // Merge and Add
        while(i<n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        result.add(newInterval);

        // After merge, adding the remaining
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray( new int[result.size()][]);
    }
}
