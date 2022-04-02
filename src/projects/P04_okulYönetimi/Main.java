package projects.P04_okulYönetimi;


public class Main {

    public static void main(String[] args) {

        Teacher ali=new Teacher("Ali",100,"Mat");
        Teacher mehmet=new Teacher("Mehmet",110,"Tur");
        Teacher ayse=new Teacher("Ayse",120,"Fen");

        Student ahmet =new Student("Ahmet",144,5,"Mat",55,false);
        Student hakan =new Student("Hakan",150,5,"Tur",65,true);
        Student elif =new Student("Elif",160,5,"Fen",75,true);

        Course mat =new Course("Mat","MT","bilmiyorum",60,"Ahmet");
        Course tur =new Course("Tur","TR","bilmiyorum",60,"Hakan");
        Course fen =new Course("Mat","FN","bilmiyorum",60,"Elif");


    }
}