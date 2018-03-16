package codekamp;

public class Student {

    public String name;
    public int mathMarks;
    public int hindiMarks;
    public static int englishMarks;


    public boolean hasStudentPassed() {
        return this.hindiMarks >= 50 && this.mathMarks >= 40 && this.englishMarks >= 30;
    }

    public boolean hasBetterRank(Student s) {
        int firstStudentTotal = this.englishMarks + this.hindiMarks + this.mathMarks;
        int secondStudentTotal = this.englishMarks + hindiMarks + mathMarks;

        Student s1 = new Student();
        System.out.println(this.englishMarks);
        return firstStudentTotal > secondStudentTotal;
    }

    public static void something(Student s) {
        Student s1 = new Student();
        System.out.println(englishMarks);
    }

    // if not not applied before methods or variables then java searches in following order
    // 1. local
    // 2. CurrentClassName.
    // 3. this.
}