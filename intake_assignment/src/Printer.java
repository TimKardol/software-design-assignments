public class Printer {
    private Student student;

    public Printer(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        String message = "Ik ben " + student.getName() + " en mijn favoriete course is" + student.getFavouriteCourse() + ".";

        return message;
    }
}
