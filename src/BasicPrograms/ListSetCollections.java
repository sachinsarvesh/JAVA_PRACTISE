package BasicPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ListSetCollections {
    public static void main(String[] args){
        List<String> cities = new ArrayList<>();

        cities.add("Goa");
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Bangalore");

        // Prints entire list
        System.out.println("Values added in list\n" + cities);

        // Removing duplicates via Set
        //Method 1
        HashSet<String> uniqueCities = new HashSet<>(cities);
        HashSet<String> uniqueCities_1 = new HashSet<>();
        HashSet<String> uniqueCities_2 = new HashSet<>();
        System.out.println("Method 1 - Direct input\n" + uniqueCities);
        for(String city : cities){
            uniqueCities_1.add(city);
        }
        System.out.println("Method 2 - Iteration method\n" + uniqueCities_1);
        uniqueCities_2.addAll(cities);
        System.out.println("Method 3 - add all inbuilt method\n" + uniqueCities_2);

        List<String> listUniqueCities = new ArrayList<>(uniqueCities_2);
        Collections.sort(listUniqueCities);

        System.out.println("Sorted and Unique List\n" + listUniqueCities);

    }
}
