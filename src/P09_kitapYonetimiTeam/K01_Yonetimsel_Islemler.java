package P09_kitapYonetimiTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static P09_kitapYonetimiTeam.OgrenciIslemleri.islemSecimMenusu;

//en babadan sonra
public class K01_Yonetimsel_Islemler extends K02_KutuphaneYoneticisi {
    static List<K02_KutuphaneYoneticisi> kitapListesi = new ArrayList<K02_KutuphaneYoneticisi>();
    static Scanner scan = new Scanner(System.in);
    static int kitapSayaci = 105;

    public static void mevcutKitapListesi() {
        K02_KutuphaneYoneticisi kitap1 = new K02_KutuphaneYoneticisi(100, "Suc ve Ceza", "Dostoyevski", "17$", "A1");
        K02_KutuphaneYoneticisi kitap2 = new K02_KutuphaneYoneticisi(101, "Savas ve Baris", "Tostoy", "19$", "B2");
        K02_KutuphaneYoneticisi kitap3 = new K02_KutuphaneYoneticisi(102, "Kurk Mantolu Madonna", "Sebahattin Ali", "15$", "C3");
        K02_KutuphaneYoneticisi kitap4 = new K02_KutuphaneYoneticisi(103, "Javaya Giris", "Elif Celik", "50$", "D4");
        K02_KutuphaneYoneticisi kitap5 = new K02_KutuphaneYoneticisi(104, "Javadan Cıkıs Yok", "Haluk Hoca", "100$", "E5");
        kitapListesi.add(kitap1);
        kitapListesi.add(kitap2);
        kitapListesi.add(kitap3);
        kitapListesi.add(kitap4);
        kitapListesi.add(kitap5);

        System.out.println("+++++MEVCUT KİTAP LİSTESİ+++++");
        for (int i = 0; i < kitapListesi.size(); i++) {// kitap listesini görmek icin yaptım olmasa da olur.
            System.out.println("kitap" + (i + 1) + " : " + kitapListesi.get(i));
        }

    }

    public static void girisPaneli() {
        System.out.println("****Kutuphane Yonetim Bilgi Sitemine Hosgeldiniz****");
        System.out.println("****Buradaki Tüm İslemler Yönetici Tarafindan Yapilacaktir****");
        System.out.println("* 1-kitap ekle\n" + // Kütüphaneye yeni gelen kitaplarin girisi yapılacaktır.
                "* 2-numara ile kitap ara\n" +// Kutuphaneye gelen personelin istediği kitaplarin nerede oldugu KitapNo ile sorgulanacak
                "* 3-bilgi ile kitap ara\n" +/* kitap ismi ve yazar ile kitap sorgulancak*/
                "* 4-numara ile kitap sil\n" +// Kütüphanden gonderilen kitaplar kütüphane kaydından düsecektir.
                "* 5-tum kitaplari listele\n" +/* tüm islemler gerçeklestirildikten sonra kütüphande bulunan kitaplar listenecektir.*/
                "* 6-cikis");
        System.out.print("Seciminiz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                kitapEkle();
                break;
            case 2:
                kitapNoileArama();
                break;
            case 3:
                kitapBilgisiIleArama();
                break;
            case 4:
                numaraileKitapSilme();
                break;
            case 5:
                kitaplariListele();
                break;
            case 6:
                kutuphanedenCikis();
                break;
            default:
                System.out.println("hatali secim yaptiniz");
                girisPaneli();

        }


    }

    private static void kitapEkle() {

        System.out.println("**kütüphaneye eklenecek kitap bilgilerini giriniz*** ");
        System.out.print("kitap adını girin :");
        scan.nextLine();//dommy
        String kitapAdi = scan.nextLine();
        System.out.print("kitap yazarini girin :");
        String kitapYazari = scan.nextLine();
        System.out.print("kitap fiyatini :");
        String kitapFiyati = scan.nextLine();
        System.out.print("hangi rafa ekleneceğini girin :");
        String kitaRafNo = scan.nextLine();
        int kitapNo =kitapSayaci++;

        System.out.println("eklediğiniz kitap : " + (kitapNo) + ". sıraya eklendi");

        K02_KutuphaneYoneticisi yeniKitap = new K02_KutuphaneYoneticisi(kitapNo, kitapAdi, kitapYazari, kitapFiyati, kitaRafNo);
        kitapListesi.add(yeniKitap);


        while (true) {
            for (int i = 0; i < kitapListesi.size(); i++) {// kitap listesini görmek icin yaptım olmasa da olur.
                System.out.println("kitap" + (i + 1) + " : " + kitapListesi.get(i));
            }
            System.out.println("kitap eklemek icin 1 ana menüye donmek icin 0'a basiniz ");

            try {
                int secim = scan.nextInt();
                if (secim == 1) kitapEkle();
                else if (secim == 0) girisPaneli();
                break;
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("-hata " + e + "hata-");
            }
        }


    }

    static void kitapNoileArama() {
        System.out.print("arama yapmak istediğiniz kitabın kitapNosunu giriniz :  ");
        int kitapNoileArancakKitap = scan.nextInt();

        boolean varMi = false;
        for (int i = 0; i < kitapListesi.size(); i++) {

            if (kitapNoileArancakKitap == kitapListesi.get(i).getKitapNo()) {
                varMi = true;
                System.out.println(kitapListesi.get(i));
            }
        }
        if (!varMi) {
            System.out.println("ARAMA YAPTIGINIZ KİTAP KÜTÜPHANEMİZDE MEVCUT DEĞİL");
        }

        while (true) {

            System.out.println("kitapNo ile arama yapmak icin 1\nana menüye donmek icin 0\n ogrenci islem menüsüne donmek icin 2\"");

            try {
                int secim = scan.nextInt();
                if (secim == 1) kitapNoileArama();
                else if (secim == 0) girisPaneli();
                else if (secim ==2) islemSecimMenusu();// ogrenciler tarafından secilecektir.
                break;
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("-hata " + e + " hata-");
            }

        }

    }

    static void kitapBilgisiIleArama() {

        System.out.println("kitap adi ile arama yapmak icin 1\nyazar adi ile arama yapmak icin 2 ");
        int secim = scan.nextInt();
        if (secim == 1) {
            System.out.print("görüntülemek istediğiniz kitap adını giriniz : ");
            scan.nextLine();//dommy
            String goruntulenecekKitap = scan.nextLine();
            boolean varMi = false;
            for (int i = 0; i < kitapListesi.size(); i++) {

                if (goruntulenecekKitap.equalsIgnoreCase(kitapListesi.get(i).getKitapAdi())) {
                    varMi = true;
                    System.out.println(kitapListesi.get(i));
                }
            }
            if (!varMi) {
                System.out.println("ARAMA YAPTIGINIZ KİTAP KÜTÜPHANEMİZDE MEVCUT DEĞİL");
            }
            while (true) {

                System.out.println("yazar adi veya kitap adi ile arama icin 1 \nana menüye donmek icin 0\n ogrenci islem menüsüne donmek icin 2");
                try {
                    secim = scan.nextInt();
                    if (secim == 1) kitapBilgisiIleArama();
                    else if (secim == 0) girisPaneli();
                    else if (secim ==2) islemSecimMenusu();
                    break;
                } catch (Exception e) {
                    String str = scan.next();
                    System.out.println("-hata " + e + " hata-");
                }

            }
        } else if (secim == 2) {

            System.out.print("görüntülemek istediğiniz yazar adını giriniz : ");
            scan.nextLine();//dommy
            String goruntulenecekYazar = scan.nextLine();
            boolean varMi = false;
            for (int i = 0; i < kitapListesi.size(); i++) {

                if (goruntulenecekYazar.equalsIgnoreCase(kitapListesi.get(i).getYazarAdi())) {
                    varMi = true;
                    System.out.println(kitapListesi.get(i));// burada kitabın tüm bilgilerini yazdirdim sadece raf bilgisi de yazdırırlabilir. (ornek)
                }
            }
            if (!varMi) {
                System.out.println("ARAMA YAPTIGINIZ KİTAP KÜTÜPHANEMİZDE MEVCUT DEĞİL");
            }
            while (true) {

                System.out.println("yazar adi veya kitap adi ile arama icin 1 \nana menüye donmek icin 0\n ogrenci islem menüsüne donmek icin 2");

                try {
                    secim = scan.nextInt();
                    if (secim == 1) kitapBilgisiIleArama();
                    else if (secim == 0) girisPaneli();
                    else if (secim ==2) islemSecimMenusu();
                    break;
                } catch (Exception e) {
                    String str = scan.next();
                    System.out.println("-hata " + e + " hata-");
                }

            }

        }
    }

    private static void numaraileKitapSilme() {
        System.out.println("************* mevcut kitap numara ve kitap adlari *************");
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i).getKitapNo() + "___" + kitapListesi.get(i).getKitapAdi());
        }
        System.out.print("silmek istediğiniz kitap numarasını giriniz : ");
        int silinecekKitapNo = scan.nextInt();
        boolean varMi = false;
        for (int i = 0; i < kitapListesi.size(); i++) {
            varMi = true;
            if (silinecekKitapNo == kitapListesi.get(i).getKitapNo()) {
                System.out.println("silmek istiyorsaniz 'E',istemiyorsanız 'H' secin");
                char secim = scan.next().toUpperCase().charAt(0);
                if (secim == 'E') {
                    kitapListesi.remove(kitapListesi.get(i));
                    System.out.println("silme islemi basari ile gerçelesti.");
                } else if (secim == 'H') numaraileKitapSilme();
            }
        }
        if (!varMi) System.out.println("aradıgınız kriterlerde kitap bulunamadi");
        while (true) {
            for (int i = 0; i < kitapListesi.size(); i++) {// kitap listesini görmek icin yaptım olmasa da olur.
                System.out.println("kitap" + (i + 1) + " : " + kitapListesi.get(i));
            }
            System.out.println("kitapNo ile silme icin 1 ana menüye donmek icin 0'a basiniz");
            try {
                int secim = scan.nextInt();
                if (secim == 1) numaraileKitapSilme();
                else if (secim == 0) girisPaneli();
                break;
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("-hata " + e + " hata-");
            }

        }


    }

    static void kitaplariListele() {

        System.out.println("****Java kütüphanesi mevcut kitaplari****");
        for (int i = 0; i < kitapListesi.size(); i++) {
            System.out.println(kitapListesi.get(i));
        }

        while (true) {
            System.out.println("kitaplari listelemek icin 1 ana menüye donmek icin 0'a basiniz ");
            try {
                int secim = scan.nextInt();
                if (secim == 1) kitaplariListele();
                else if (secim == 0) girisPaneli();
                break;
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("-hata " + e + " hata-");
            }
        }

    }

    static void kutuphanedenCikis() {
        System.out.println("yine bekleriz...");
    }

}
