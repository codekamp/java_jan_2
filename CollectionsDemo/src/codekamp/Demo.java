package codekamp;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        List<Student> detained = Student.getAllDetained();

        for(int i = 0; i < detained.size(); i = i + 2) {
            Student s = detained.get(i);

            System.out.println(s.name);
        }

        for(Student theElement: detained) {
            System.out.println(theElement.name);
        }

        Collections.shuffle(detained);

        HashMap<String, Integer> population = new HashMap<String, Integer>();
        HashMap<Student, Student> bestFriend = new HashMap<Student, Student>();


        population.put("India", 100000000);
        population.put("Pakistan", 898989);

        int ip = population.get("India");

        population.isEmpty();


//        LinkedList<String> names = new LinkedList<String>();
//
//        names.add("Suresh");
//        names.add("Ramesh");
//        names.add("Jignesh");
//
//        System.out.println(names);
//
//        names.add(1, "Dharmesh");
//
//
//        System.out.println(names.contains("Dharmesh"));
//        System.out.println(names);
//
//        names.set(1, "Vishesh");
//        System.out.println(names);
//
//        names.remove(2);
//        System.out.println(names);
//
//        System.out.println(names.isEmpty());
//        System.out.println(names.size());
//        System.out.println(names.contains("Suresh"));
    }
}