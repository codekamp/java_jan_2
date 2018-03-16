package codekamp;

public class Demo {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Amit";
        s1.mathMarks = 70;
        s1.hindiMarks = 60;
        s1.englishMarks = 40;


        Student s2 = new Student();

        s2.name = "Sumit";
        s2.mathMarks = 75;
        s2.hindiMarks = 45;
        s2.englishMarks = 99;

        s2.hasStudentPassed();

        System.out.println(s2.hasBetterRank(s1));

//        IntelliJ JetBrains.com

//        JDK oracle.com












        
    }
}