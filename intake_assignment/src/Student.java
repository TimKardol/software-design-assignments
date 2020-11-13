public class Student {
    private String name;
    private int age;
    private int studentNumber;
    private String favouriteCourse;

    Student (String name, int age, int studentNumber, String favouriteCourse) {
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
        this.favouriteCourse = favouriteCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFavouriteCourse() {
        return favouriteCourse;
    }

    public void setFavouriteCourse(String favouriteCourse) {
        this.favouriteCourse = favouriteCourse;
    }
}
