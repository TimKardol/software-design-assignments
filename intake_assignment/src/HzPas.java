public class HzPas {
    private Student student;

    public HzPas(Student student) {
        this.student = student;


    }
    @Override
    public String toString (){
        String message = "Uw student nummer is" + this.student.getStudentNumber() + "en uw naam is" + this.student.getName();
        return message;
    }
}