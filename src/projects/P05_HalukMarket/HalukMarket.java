package projects.P05_HalukMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HalukMarket {
    static Scanner scan = new Scanner(System.in);
    static int secim;
    static double kg;
    static double para = 100;
    static List<Integer> urunNumarasi = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    static List<String> urunListesi = new ArrayList<>(Arrays.asList("domates", "patates", "biber", "sogan", "havuc", "elma", "muz", "cilek", "kavun", "uzum", "limon"));
    static List<Double> urunFiyatListesi = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
    static List<String> sepet = new ArrayList<>();
    static int secimMiktari = 0;
    static double urunTolamTutar = 0;


    public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */

        whileGit();
        System.out.println(sepet);
        System.out.println("toplam ödenecek tutar :" + urunTolamTutar + " para üstü : " + (para - urunTolamTutar));
    }
    public static void whileGit() {

        while (urunListesi.size() > secimMiktari) {
            System.out.println("secmek istediğiniz urun numarasını giriniz");
            secim = scan.nextInt();
            sepet.add(urunListesi.get(secim));
            System.out.println("kac kilogram almak istediginizi giriniz");
            kg = scan.nextInt();
            urunTolamTutar += (urunFiyatListesi.get(secim) * kg);
            System.out.println("yeniden urun secmek 1'i cıkıs yapmak icin 0'ı seciniz");
            int secim2 = scan.nextInt();
            if (secim2 == 1) {
                whileGit();
            } else if (secim2 == 0) {
                secimMiktari += urunListesi.size() + 2;
            } else {
                System.out.println("hatali secim ");
            }
        }
    }
}

