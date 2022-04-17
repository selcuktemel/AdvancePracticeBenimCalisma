package projects.P07_GeometrikHesaplama;

public class Runner {

    public static void main(String[] args) {
        Cember cember = new Cember(3.14, 2);
        cember.cemberinAlani();
        cember.cemberinCevresi();
        Dikdortgen dikdortgen = new Dikdortgen(12.5, 17.5);
        dikdortgen.didortgeninAlani();
        dikdortgen.dikdortgeninCevrsi();
        Kare kare = new Kare(22.5);
        kare.kareninAlani();
        kare.kareninCevresi();
    }

}
