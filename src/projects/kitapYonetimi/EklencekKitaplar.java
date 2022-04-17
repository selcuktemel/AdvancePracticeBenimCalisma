package projects.kitapYonetimi;

public class EklencekKitaplar {
    public int kitapNo;
    public String kitapAdı;
    public String yazar;
    public int kitapFiyat;

    EklencekKitaplar() {

    }


    public EklencekKitaplar(int kitapNo, String kitapAdı, String yazar, int kitapFiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdı = kitapAdı;
        this.yazar = yazar;
        this.kitapFiyat = kitapFiyat;
    }
}
