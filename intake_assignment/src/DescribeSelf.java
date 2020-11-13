import java.io.FileNotFoundException;

public class DescribeSelf {
    public static void main (String[] args) throws FileNotFoundException {
        Console console = new Console();

        console.log("Welkom bij dit script");

        Student student1 = new Student("Tim", 20, 1234, "SDE");
        Student student2 = new Student("Gianni", 18, 1235, "Code Wizardry");

        Student[] students = {student1, student2};

        for (Student student: students) {
            console.log(student.getName());
        }

        School school = new School("HZ");

        school.entrance(students[0]);
        console.log(school.getStudentPasses());
        school.entrance(students[1]);
        console.log(school.getStudentPasses());
    }
}
