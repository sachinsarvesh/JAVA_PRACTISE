package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args){
       int[][] intervals = {{8,10},{1,3},{15,18} ,{2,6}};
        mergeIntervals(intervals);
        System.out.println(Arrays.deepToString(mergeIntervals(intervals)));
    }

    private static int[][] mergeIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for(int j =1; j < intervals.length; j++){
            int[] last = result.get(result.size()-1);
            int[] curr = intervals[j];

            if(curr[0] <= last[1]) last[1] = Math.max(curr[1], last[1]);
            else result.add(curr);
        }
        return result.toArray(new int[result.size()][]);
    }
}
