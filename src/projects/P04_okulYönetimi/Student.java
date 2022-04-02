package projects.P04_okulYönetimi;

public class Student {
    String name;
    int stuNo;
    int classes;
    String course1;
    String course2;
    String course3;
    double avarage;
    boolean isPass;

    Student(){

    }

    public Student(String name, int stuNo, int classes, String course1, double avarage, boolean isPass) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.avarage = avarage;
        this.isPass = isPass;
    }
    public Student(String name, int stuNo, int classes, String course2, String course3, double avarage, boolean isPass) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course2 = course2;
        this.course3 = course3;
        this.avarage = avarage;
        this.isPass = isPass;
    }

    public void addBulkExamNote(){

    }

    public void isPass() {

    }

    public void calcAvarage() {

    }

    public void printNote() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNo=" + stuNo +
                ", classes=" + classes +
                ", course1='" + course1 + '\'' +
                ", course2='" + course2 + '\'' +
                ", course3='" + course3 + '\'' +
                ", avarage=" + avarage +
                ", isPass=" + isPass +
                '}';
    }
}
