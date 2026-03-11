package BasicPrograms;

import java.util.HashMap;

public class StudentMarkViaHashMap {
    public static void main(String[] args){

        HashMap <String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("Titus", 70);
        studentMarks.put("Dany", 79);
        studentMarks.put("Jenkin", 83);
        studentMarks.put("Sarvesh", 65);

        for(String name : studentMarks.keySet()){
            System.out.println(name + "'s mark is " + studentMarks.get(name));
        }
    }
}
