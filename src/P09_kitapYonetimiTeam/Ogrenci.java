package P09_kitapYonetimiTeam;




//bunun cocugu yok
public class Ogrenci extends K01_Yonetimsel_Islemler {

    static String ogrenciAdsoyad;
    static String kimlikNo;
    private String sifre;

    public Ogrenci() {

    }

    public Ogrenci(String ogrenciAdsoyad, String kimlikNo ) {
        this.ogrenciAdsoyad = ogrenciAdsoyad;
        this.kimlikNo = kimlikNo;

    }

    public String getOgrenciAdsoyad() {
        return ogrenciAdsoyad;
    }

    public void setOgrenciAdsoyad(String ogrenciAdsoyad) {
        this.ogrenciAdsoyad = ogrenciAdsoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getSifre() {
        return sifre;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                ", ogrenciAdsoyad='" + ogrenciAdsoyad + '\'' +
                ", kimlikNo='" + kimlikNo + '\'' +
                '}';
    }
}
