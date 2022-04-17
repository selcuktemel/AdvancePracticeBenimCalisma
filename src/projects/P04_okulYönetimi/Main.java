package projects.P04_okulYönetimi;


import java.util.Scanner;


import static projects.P04_okulYönetimi.Course.teacherMat;

public class Main {
    /*
    Bir okulda 3 ögretmen üc ogrenci üc kusr bulunmaktadır.
    bu okuldaki ogrenciler tüm derslere gimektedir. her derse farklı ogretmen girmektedir.
     */

    public static void main(String[] args) {


        Student ali = new Student();
        ali.tur = new Course();
        ali.bio = new Course();

        ali.mat = new Course();
        ali.mat.teacherMat = new Teacher("metmet", "Mat");
        ali.mat.courseName = "Matematik";
        ali.mat.code = "M01";
        ali.mat.notYazili = 100;
        ali.mat.noteSozlu = 25;
        ali.name = "Ali Can";
        ali.stuNo = 1001;
        ali.classes = 5;
        ali.calcAvarage();
        ali.printNote();
        ali.isPass();

        System.out.println(ali.avarage);
        System.out.println("ali = " + ali);

    }


}
