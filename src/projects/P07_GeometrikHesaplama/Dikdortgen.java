package projects.P07_GeometrikHesaplama;

public class Dikdortgen extends Sekil {

    public Dikdortgen() {

    }

    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }


    public void didortgeninAlani() {
        System.out.println("dikdortgeninAlani= " + (uzunluk * genislik));
    }

    public void dikdortgeninCevrsi() {
        System.out.println("dikdortgeninCevresi= " + (2 * (uzunluk * genislik)));
    }

}
