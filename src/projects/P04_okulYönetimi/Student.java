package projects.P04_okulYönetimi;

import java.util.ArrayList;
import java.util.List;

public class Student extends Course {
    Course mat;
    Course tur;
    Course bio;
    String name;
    int stuNo;
    int classes;
    double avarage;
    boolean isPass;


    Student() {

    }

    public Student(Course mat, Course tur, Course bio, String name, int stuNo, int classes, double avarage, boolean isPass) {
        this.mat = mat;
        this.tur = tur;
        this.bio = bio;
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = avarage;
        this.isPass = isPass;
    }


    public void addBulkExamNote() {
        List<Double> matNotu = new ArrayList<Double>();


    }

    public void isPass() {
        if (avarage >= 50) {
            isPass = true;
        } else {
            isPass = false;
        }

    }

    public void calcAvarage() {

        if (!(mat == null)) {
            avarage = (mat.noteSozlu * 0.2) + (mat.notYazili * 0.8);
        } else if (!(bio == null)) {
            avarage = (bio.noteSozlu * 0.2) + (bio.notYazili * 0.8);
        } else if (!(tur == null)) {
            avarage = (tur.noteSozlu * 0.2) + (tur.notYazili * 0.8);
        }


    }

    public void printNote() {
        if (!(mat == null)) {
            System.out.println("mat sozlü notu  : " + mat.noteSozlu);
            System.out.println("mat yazili notu : " + mat.notYazili);
        } else if (!(bio == null)) {
            System.out.println("BİO sozlü notu  : " + bio.noteSozlu);
            System.out.println("BİO yazili notu : " + bio.notYazili);
        } else if (!(tur == null)) {
            System.out.println("TUR sozlü notu  : " + tur.noteSozlu);
            System.out.println("TUR yazili notu : " + tur.notYazili);
        }
    }


    @Override
    public String toString() {
        return "Student{" +
                "mat=" + mat +
                ", tur=" + tur +
                ", bio=" + bio +
                ", name='" + name + '\'' +
                ", stuNo=" + stuNo +
                ", classes=" + classes +
                ", avarage=" + avarage +
                ", isPass=" + isPass +
                '}';
    }


}
