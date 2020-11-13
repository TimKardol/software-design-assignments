import java.lang.reflect.Array;
import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    private String name;

    public School (String name) {
        this.name = name;

        this.students = new ArrayList<Student>();
    }

    public void entrance (Student student) {
        this.students.add(student);
    }

    public String[] getStudentPasses() {
        StringBuilder builder = new StringBuilder();

        for (Student student: this.students) {
            HzPas pass = new HzPas(student);
            String str = pass.toString();
            builder.append(str);
        }


    }
}
