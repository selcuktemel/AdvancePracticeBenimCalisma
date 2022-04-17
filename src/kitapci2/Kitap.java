package kitapci2;

public class Kitap {

    private String kitapAdi;
    private String yazarAdi;
    private int fiyati;
    int kitapNo ;

    public Kitap() {}

    public Kitap(String kitapAdi, String yazarAdi, int fiyati, int kitapNo) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.fiyati = fiyati;
        this.kitapNo = kitapNo;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getFiyati() {
        return fiyati;
    }

    public void setFiyati(int fiyati) {
        this.fiyati = fiyati;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", fiyati=" + fiyati +
                ", kitapNo=" + kitapNo +
                '}';
    }
}
