package _14_Encapsulation.Q01;

public class ArabaMain {
    public static void main(String[] args) {

        Araba volvo = new Araba("XC40", "beyaz", 1500, 2022);
        System.out.println(volvo);
        Araba honda = new Araba("jazz", "mor", 100, 2000);
        System.out.println(honda);
        Araba bmw = new Araba("i5", 2020);
        System.out.println(bmw);
        bmw.setRenk("mor");
        System.out.println(bmw);

    }
}
