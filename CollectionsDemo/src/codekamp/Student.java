package codekamp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {

    private static Student theSingleObject;

    private String name;
    private int age;

//    public int attendance;

    private Student() {

    }

    synchronized public static Student getTheSingleObject() {
        if(Student.theSingleObject == null) {
            Student.theSingleObject = new Student();
        }

        return Student.theSingleObject;
    }

//    public static void setTheSingleObject(Student s) {
//        Student.theSingleObject = s;
//    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age < 0) {
            throw new Exception("Age can't be negative");
        }
        this.age = age;
    }

//    private Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public static ArrayList<Student> getAll() {
//        ArrayList<Student> students = new ArrayList<Student>();
//        students.add(new Student("Suresh", 20));
//        students.add(new Student("Ramesh", 22));
//        students.add(new Student("Jignesh", 19));
//
//        return students;
//    }
//
//    public static List<Student> getAllDetained() {
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Suresh", 20));
//        students.add(new Student("Ramesh", 22));
//        students.add(new Student("Jignesh", 19));
//
//        return students;
//    }
//
//    public static Student getByRollNumber(int rollNumber) {
//        return new Student("Suresh", 20);
//    }
//
//    public boolean isDetained() {
//        return this.attendance < 75;
//    }
}