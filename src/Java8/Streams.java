package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args){

        var persons = new ArrayList<Person>();

        persons.add(new Person("Gowtham",34));
        persons.add(new Person("Anand",42));
        persons.add(new Person("Vijay",38));
        persons.add(new Person("Venkat",32));
        persons.add(new Person("Kathir",30));
        persons.add(new Person("Praveen",30));
        persons.add(new Person("Sachin",27));
        persons.add(new Person("Salman",24));

        List<Person> twenties = persons
                .stream()
                .filter(p -> p.getAge() < 30)
                .toList();

        for(Person personLess30 : twenties){
            System.out.println(personLess30.getName());
        }

    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

//    @Override
//    public int compareTo(Object o){
//        return getName().compareTo(((Person) o).getName()));
//    }
}
