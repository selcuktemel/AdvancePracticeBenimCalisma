package kitapci2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Methods {
    static List<Kitap> kitapListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int kitapSayaci = 0;

    public static void girisPaneli() {
        System.out.println("*****Kitapciya Hosgeldiniz*****");
        System.out.println("* 1-kitap ekle\n" +
                "* 2-numara ile kitap goruntule\n" +
                "* 3-bilgi ile kitap goruntule\n" +
                "* 4-numara ile kitap sil\n" +
                "* 5-tum kitaplari listele\n" +
                "* 6-cikis");
        System.out.print("Seciminiz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                kitapEkle();
                break;
            case 2:
                kitapNoileGoruntule();
                break;
            case 3:
                kitapBilgiileGoruntule();
                break;
            case 4:
                numaraileSil();
                break;
            case 5:
                tumkitaplariListele();
                break;
            case 6:
                cikis();
                break;
            default:
                System.out.println("hatali secim yaptiniz");
                girisPaneli();
        }
    }

    public static void kitapEkle() {
        System.out.println("***Eklemek istediğiniz kitaplarin bildilerini giriniz***");
        scan.nextLine(); // dummy scan
        System.out.print(" + kitap adini giriniz : ");
        String kitapAdi = scan.nextLine();
        System.out.print(" + kitap yazarini giriniz : ");
        String kitapYazari = scan.nextLine();
        System.out.print(" + kitap fiyatini giriniz : ");
        int kitapFiyati = scan.nextInt();
        int kitapNo = 1000 + kitapSayaci;
        kitapSayaci++;
        System.out.println("eklediğiniz kitap : " + (kitapNo) + ". sıraya eklendi");

        Kitap yeniKitap = new Kitap(kitapAdi, kitapYazari, kitapFiyati, kitapNo);
        kitapListesi.add(yeniKitap);


        while (true) {
            System.out.println("kitap eklemek icin 1 ana menüye donmek icin 0'a basiniz ");
            int secim = scan.nextInt();
            if (secim == 1) {
                kitapEkle();
            } else if (secim == 0) {
                girisPaneli();
            } else {
                System.out.println("hatali secim yaptınız : ");

            }
        }
    }

    public static void kitapNoileGoruntule() {
        for (int i = 0; i < kitapListesi.size(); i++) { // eklenen tüm kitap numaralarını yazdırdık.
            System.out.println("kitap numarasi  : " + kitapListesi.get(i).getKitapNo());
        }
        System.out.println("lütfen listelemek istediğiniz kitabın numarasını giriniz : ");
        int kitapNoGiris = scan.nextInt();
        boolean kitapVarMi = false;
        for (int i = 0; i < kitapListesi.size(); i++) {
            if (kitapNoGiris == kitapListesi.get(i).getKitapNo()) {
                kitapVarMi = true;
                System.out.println(kitapListesi.get(i));
            }

        }
        if (!kitapVarMi) {
            System.out.println("aradiginiz kritere göre kitap bulunamadı");
            kitapNoileGoruntule();
        }

        while (true) {
            System.out.println("numara ile kitap goruntulek icin 1 ana menüye donmek icin 0'a basiniz ");
            int secim = scan.nextInt();
            if (secim == 1) {
                kitapNoileGoruntule();
            } else if (secim == 0) {
                girisPaneli();
            } else {
                System.out.println("hatali secim yaptınız : ");
            }
        }

    }

    public static void kitapBilgiileGoruntule() {
        for (int i = 0; i < kitapListesi.size(); i++) { // eklenen tüm kitap numaralarını yazdırdık.
            System.out.println("kitapAdi= " + kitapListesi.get(i).getKitapAdi());
            System.out.println("yazarAdi= " + kitapListesi.get(i).getYazarAdi());
        }
        System.out.println("kitap adi ile arama yapmak icin 1 : \n" +
                "yazar adi ile arama yapmak icin 2 : ");
        int secim = scan.nextInt();
        if (secim == 1) {
            scan.nextLine(); // dummy scan
            System.out.println("lütfen kitap adını giriniz");
            String secilenKitapAdi = scan.nextLine();
            boolean varMi = false;
            for (int i = 0; i < kitapListesi.size(); i++) {

                if (secilenKitapAdi.equalsIgnoreCase(kitapListesi.get(i).getKitapAdi())) {
                    varMi = true;
                    System.out.println(kitapListesi.get(i));
                }
            }
            if (!varMi) {
                System.out.println("aradiginiz kritere göre kitap bulunamadı");
                kitapBilgiileGoruntule();
            }

        } else if (secim == 2) {
            scan.nextLine(); // dummy scan
            System.out.println("lütfen kitap yazarini giriniz");
            String secilenKitapYazari = scan.nextLine();
            boolean varMi = false;
            for (int i = 0; i < kitapListesi.size(); i++) {
                if (secilenKitapYazari.equalsIgnoreCase(kitapListesi.get(i).getYazarAdi())) {
                    varMi = true;
                    System.out.println(kitapListesi.get(i));
                }
            }
            if (!varMi) {
                System.out.println("aradiginiz kritere göre kitap bulunamadı");
                kitapBilgiileGoruntule();
            }
        } else {
            System.out.println("Hatali secim ");
            kitapBilgiileGoruntule();
        }

        while (true) {
            System.out.println("bilgi ile kitap goruntulemek icin 1 ana menüye donmek icin 0'a basiniz ");
            secim = scan.nextInt();
            if (secim == 1) {
                kitapBilgiileGoruntule();
            } else if (secim == 0) {
                girisPaneli();
            } else {
                System.out.println("hatali secim yaptınız : ");
                kitapBilgiileGoruntule();
            }
        }
    }

    public static void numaraileSil() {
        scan.nextLine(); // dummy scan
        for (int i = 0; i < kitapListesi.size(); i++) { // eklenen tüm kitap numaralarını yazdırdık.
            System.out.println("Kitap numarasi :" + kitapListesi.get(i).getKitapNo());
        }
        System.out.print("silmek istediğiniz numarayi seciniz : ");
        int secim = scan.nextInt();
        boolean varMi = false;
        for (int i = 0; i < kitapListesi.size(); i++) {
            if (secim == kitapListesi.get(i).getKitapNo()) {
                varMi = true;
                System.out.println(secim + " numarali kitabi silmek üzeresiniz ");
                System.out.println("silmek istiyorsaniz 'E' istemiyorsanız 'H' seciniz ");
                String silmeSecimi = scan.next();
                if (silmeSecimi.equalsIgnoreCase("E")) {
                    kitapListesi.remove(kitapListesi.get(i));
                    System.out.println("kitap basari ile silindi. ");
                }else if (silmeSecimi.equalsIgnoreCase("H")) {
                    System.out.println("silme islemi iptal edildi");
                }
            }
        }
        if (!varMi) {
            System.out.println("Aradiginiz kriterler uygun sonuc bulunamadi. ");

        }
        while (true) {
            System.out.println("numara ile kitap silmek icin 1 ana menüye donmek icin 0'a basiniz ");

            try {
                secim = scan.nextInt();
                if (secim == 1) numaraileSil();
                else if (secim == 0) girisPaneli();
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Hatali giris yaptiniz." + e);
            }
        }


    }

    public static void tumkitaplariListele() {

        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println("Kitap " + (i + 1) + " : " + kitapListesi.get(i));
        }
        girisPaneli();
    }

    public static void cikis() {
        System.out.println("iyi günler dileriz..");
    }

}
