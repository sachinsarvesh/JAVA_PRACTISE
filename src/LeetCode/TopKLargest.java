package LeetCode;

import java.util.*;

public class TopKLargest {
    public static void main(String[] args){
        int[] nums = {1,2,1,2,1,2,3,1,3,2} ;
        int k =2;
        findKFrequencies(nums,k);
    }

    private static int[] findKFrequencies(int[] nums, int k) {
        // Method to find frequency
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("map : " + map);

        //Method to put in order
        List<Integer>[] bucket = new List[nums.length+1];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(bucket[freq] == null)  bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        System.out.println("bucket list : " + Arrays.toString(bucket));

        int[] result = new int[k];
        int index = 0;

        for(int i = bucket.length-1; i >=0 && index < k; i--){
            if(bucket[i] != null){
                for (int num : bucket[i]) {
                    result[index++] = num;
                    if (index == k) break;
                }
            }
        }
        System.out.println("result index : " + Arrays.toString(result));
        return result;
    }
}
