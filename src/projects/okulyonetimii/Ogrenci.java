package projects.okulyonetimii;

public class Ogrenci extends Kisi {

    private String orenciNo;
    private String sinif;

    public Ogrenci() {

    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String orenciNo, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.orenciNo = orenciNo;
        this.sinif = sinif;
    }

    public String getOrenciNo() {
        return orenciNo;
    }

    public void setOrenciNo(String orenciNo) {
        this.orenciNo = orenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "orenciNo='" + orenciNo + '\'' +
                ", sinif='" + sinif + '\'' +
                  '}';
    }
}
