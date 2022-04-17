package P09_kitapYonetimiTeam;

import java.util.ArrayList;
import java.util.List;


public class OgrenciIslemleri extends Ogrenci {
    static List<K02_KutuphaneYoneticisi> alinanKitapListesi = new ArrayList<>();

    public static void ogrenciGirisPaneli() {
        System.out.println("****Kutuphane Yonetim Bilgi Sitemine Hosgeldiniz****");
        System.out.println("****Buradaki Tüm İslemler Ogrenci Tarafindan Yapilacaktir****");
        System.out.println("lütfen adınızı soy adınızı giriniz : ");

        ogrenciAdsoyad = scan.nextLine();
        System.out.println("lütfen kimlik numaranizi");

        kimlikNo = scan.next();
        System.out.println("sifrenizi giriniz ");
        String sifre = scan.next();
        if (sifre.equalsIgnoreCase("1234")) {
            System.out.println("basari ile giris yaptiniz");
            islemSecimMenusu();
        } else {
            System.out.println("hatali giris yaptiniz tekrar deneyiniz");
            ogrenciGirisPaneli();
        }
    }

    static void islemSecimMenusu() {
        System.out.println("YAPMAK İSTEDİGİNİZ İŞLEMİ SECİNİZ");
        System.out.println("* 1-Kitap alma\n" +
                "* 2- kitap numarasi veya bilgi ile kitap ara\n" +/* kitap ismi ve yazar ile kitap sorgulancak*/
                "* 3-tum kitaplari listele\n" +/* tüm islemler gerçeklestirildikten sonra kütüphande bulunan kitaplar listenecektir.*/
                "* 4-kitap bagisi\n" +
                "* 5-cikis");
        System.out.print("Seciminiz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                kitapAlma();
                break;
            case 2:
                System.out.println("numara ile aramak istiyorsaniz 1/ yazar veya kitap bilgisi ile aramak istiyorsaniz 2");
                secim = scan.nextInt();
                if (secim == 1) kitapNoileArama();
                else if (secim == 2) kitapBilgisiIleArama();
                break;
            case 3:
                System.out.println("mevcut kitaplar icin 1, sepete ekelediğiniz kitaplar icin 2");
                secim = scan.nextInt();
                if (secim == 1) {
                    System.out.println("Kütüphandeki kitaplar : " + kitapListesi);
                } else if (secim == 2) {
                    Ogrenci ogrenci = new Ogrenci(ogrenciAdsoyad, kimlikNo);
                    System.out.println(ogrenci);
                    System.out.println("Ogrencnin almak istediği kitaplar : " + alinanKitapListesi);
                }
                break;
            case 4:
                kitapBagisi();
                break;
            case 5:
                kutuphanedenCikis();
                break;
            default:
                System.out.println("hatali secim yaptini");
                islemSecimMenusu();
        }


    }

    private static void kitapBagisi() {
        System.out.println("bağıslamak istediğiniz kitaplarin bilgilerini giriniz.");
        System.out.print("kitap adını girin :");
        scan.nextLine();//dommy
        String kitapAdi = scan.nextLine();
        System.out.print("kitap yazarini girin :");
        String kitapYazari = scan.nextLine();
        K02_KutuphaneYoneticisi bagisKitap = new K02_KutuphaneYoneticisi(kitapAdi, kitapYazari);
        kitapListesi.add(bagisKitap);
        System.out.println(kitapListesi);


        while (true) {
            System.out.println("kitap bagısına devame etmek icin 1 ana menüye donmek icin 0'a basiniz ");
            try {
                int secim = scan.nextInt();
                if (secim == 1) kitapBagisi();
                else if (secim == 0) islemSecimMenusu();

            } catch (Exception e) {
                String str = scan.next();
                System.out.println("-hata " + e + "hata-");
            }
        }
    }

    private static void kitapAlma() {
        System.out.println("***KİTAP ALMA PANELİNE HOSGELDİNİZ***");
        System.out.println("almak istediğiniz kitap numarasini giriniz : ");
        // String kitapAdi = scan.nextLine();
        // scan.next(); kitap adi ile aratmayi denedim ama olmadi
        int kitapNo = scan.nextInt();

        boolean varMi = false;
        for (int i = 0; i < kitapListesi.size(); i++) {

            if (kitapNo == (kitapListesi.get(i).getKitapNo())) {
                varMi = true;
                alinanKitapListesi.add(kitapListesi.get(i));
                kitapListesi.remove(kitapListesi.get(i));
            }
        }
        if (alinanKitapListesi.size() == 3) {
            System.out.println(" kitap alma hakkiniz 2 ile sınırlandırılmıstır. lütfen baska islem yapiniz.");
            islemSecimMenusu();
        }

        if (!varMi) {
            System.out.println("aradıgınız kitap sistemde bulunamadi lütfen tekrar deneyiniz");
        }

        System.out.println("kitap eklemek icin 1 ana menüye donmek icin 0'a basiniz ");

        while (true) {

            try {
                int secim = scan.nextInt();
                if (secim == 1) kitapAlma();
                else if (secim == 0) islemSecimMenusu();

            } catch (Exception e) {
                String str = scan.next();
                System.out.println("-hata " + e + "hata-");
            }
        }
    }
}
