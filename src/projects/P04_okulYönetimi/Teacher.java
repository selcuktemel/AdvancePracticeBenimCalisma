package projects.P04_okulYönetimi;

public class Teacher  extends  Course{
    String name;
    String branch;

    Teacher() {

    }

    public Teacher(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }




    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
