package LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args){

        String[] str = {"flower", "flow", "flight"};
//        System.out.println(findPrefix(str));
//        System.out.println(findPrefix_v2(str));
        System.out.println(findPrefix_v3(str));
    }
    /*
    Version 3
    Time: O(n log n + m) (due to sorting)
    Space: O(1)
    */
    private static String findPrefix_v3(String[] str) {
        if(str == null || str.length == 0) return "";

        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length -1];
        int i = 0 ;

        while(i < first.length() && i < last.length()){
            if(first.charAt(i) != last.charAt(i)) break;
            i++;
        }

        return first.substring(0,i);
    }

    /*
    Version 2
    Time: O(n * m)
    Space: O(1)
     */
    private static String findPrefix_v2(String[] str) {
        if(str == null || str.length ==0) return "";

        for(int i =0; i < str[0].length();i++){
            char ch = str[0].charAt(i);

            for(int j=1; j< str.length;j++){
                if(i >= str[j].length() || str[j].charAt(i) != ch){
                    return str[0].substring(0,i);
                }
            }
        }
        return str[0];
    }

    /* Version 1
    Time: O(n * m²) (substring operations costly)
    Space: O(1)
     */
    private static String findPrefix(String[] str) {
        if (str == null || str.length == 0) return null;
        String prefix = str[0];

        for(int i = 1; i < str.length; i++){
            while(str[i].indexOf(prefix) !=0){
                prefix = prefix.substring(0,prefix.length()-1);

                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }





}
