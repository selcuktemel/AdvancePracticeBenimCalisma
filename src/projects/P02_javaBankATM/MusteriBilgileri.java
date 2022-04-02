package projects.P02_javaBankATM;

public class MusteriBilgileri {
    private String isim;
    private String soyad;
    private String iban;


    public MusteriBilgileri(String isim, String soyad, String iban) {
        this.isim = isim;
        this.soyad = soyad;
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Musteri : " +
                "İsim: " + isim +
                ", Soyad: " + soyad +
                ", IBAN: " + iban;
    }
}

