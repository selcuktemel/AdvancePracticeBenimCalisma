package projects.P04_okulYönetimi;


public class Course {

    static Teacher teacherMat;
    String courseName;
    String code;
    int notYazili;
    int noteSozlu;

    Course() {

    }

    public Course(Teacher teacher, String courseName, String code, int notYazili, int noteSozlu) {

        this.teacherMat = teacher;
        this.courseName = courseName;
        this.code = code;
        this.notYazili = notYazili;
        this.noteSozlu = noteSozlu;
    }

    public static Teacher addTeacher(Teacher teacher) {
        Teacher.teacherMat = new Teacher("metmet", "Mat");

        return Teacher.teacherMat;

    }

    public static void printTeacher() {
        System.out.println(teacherMat);

    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", code='" + code + '\'' +
                ", notYazili=" + notYazili +
                ", noteSozlu=" + noteSozlu +
                '}';
    }
}
