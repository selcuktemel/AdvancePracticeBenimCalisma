package projects.P07_GeometrikHesaplama;

public class Kare extends Dikdortgen {

    public Kare() {

    }

    public Kare(double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public void kareninAlani() {
        System.out.println("kareninAlani= " + (uzunluk * uzunluk));
    }

    public void kareninCevresi() {
        System.out.println("kareninCevresi = " + (4 * uzunluk));
    }
}


	


	


	
	
	
	
	
	
	

