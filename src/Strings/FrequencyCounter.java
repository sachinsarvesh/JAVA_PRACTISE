package Strings;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args){
        String sampleText = "SACHINSARVESH";

        Map<Character,Integer> map = new HashMap<>();
        for(char c : sampleText.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
    }
}
