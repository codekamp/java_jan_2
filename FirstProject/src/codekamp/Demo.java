package codekamp;

public class Demo {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30}; // #1
        int[] arr2 = arr1;
        int[] arr3 = {10, 20, 30}; // #2

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);


        arr1[0]++;

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);

        arr1 = arr3;


        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr3[0]);


        arr2 = arr1;

        System.gc();


//        Student s1;
//        s1 = new Student();
//        Student s2 = new Student();
//
//        s1.name = "Amit";
//        s1.email = "amit@gmail.com";
//        s1.age = 10;
//        Student.averageAge = 50;
//
//        s2.name = "Sumit";
//        s2.email = "sumit@gmail.com";
//        s2.age = 20;
//        Student.averageAge = 90;
//
//        System.out.println(s1.name);
//        System.out.println(s2.name);
//        System.out.println(s1.age);
//        System.out.println(s2.age);
//        System.out.println(Student.averageAge);
//        System.out.println(Student.averageAge);
    }

}

// everything camelcase
// myAwesomeVariable

// if File or Class on Interface, even first character of first word capital

// MyAwesomeClass
