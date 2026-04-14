package LeetCode;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args){
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(nonOLI(intervals));
    }

    private static int nonOLI(int[][] intervals) {

        Arrays.sort(intervals,(a,b) -> a[1] - b[1]);
        int kept =1;
        int LastEnd = intervals[0][1];

        for(int i = 1; i < intervals.length;i++){
            if(intervals[i][0] >= LastEnd){
                kept++;
                LastEnd = intervals[i][1];
            }
        }

        return intervals.length - kept;
    }
}
