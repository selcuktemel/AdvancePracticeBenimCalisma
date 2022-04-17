package projects.P07_GeometrikHesaplama;

public class Cember extends Sekil {

    public Cember() {

    }

    public Cember(double pi, double yaricap) {
        this.pi = pi;
        this.yaricap = yaricap;
    }

    public void cemberinAlani() {

        System.out.println("cemberinAlani = " + (pi * yaricap * yaricap));
    }

    public void cemberinCevresi() {

        System.out.println("cemberinCevresi = " + (2 * pi * yaricap));
    }


}
