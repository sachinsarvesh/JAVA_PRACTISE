package TestInterview;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IBM_greedy {
    public static void main(String[] args){
        int[] currentCap = {1,1,1};
        int[] cost ={9,7,4};
        int avg = 3;
        int max = 5;
        System.out.println(calculateMinCost(currentCap, cost,avg,max));
    }

    private static int calculateMinCost(int[] currentCap, int[] cost, int avg, int max) {
        int n = currentCap.length;
        int total = 0;

        for (int x : currentCap) total += x;

        int required = avg * n - total;
        if (required <= 0) return 0;

        // create pairs (cost, maxAdd)
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new int[]{cost[i], max - currentCap[i]});
        }

// sort by cost
        Collections.sort(list, (a, b) -> a[0] - b[0]);

        int minCost = 0;

        for (int[] pair : list) {
            int c = pair[0];
            int canAdd = pair[1];

            int take = Math.min(required, canAdd);
            minCost += take * c;
            required -= take;

            if (required == 0) break;
        }

        return required > 0 ? -1 : minCost;
    }


}
