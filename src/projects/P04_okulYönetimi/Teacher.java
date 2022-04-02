package projects.P04_okulYönetimi;

public class Teacher {
    String name;
    int mpno;
    String branch;
    Teacher(){

    }

    public Teacher(String name, int mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", mpno='" + mpno + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
