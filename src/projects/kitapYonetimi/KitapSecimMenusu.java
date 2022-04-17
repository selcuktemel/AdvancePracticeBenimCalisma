package projects.kitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapSecimMenusu {
    static Scanner scan = new Scanner(System.in);
    static List<EklencekKitaplar> kitapListe =new ArrayList<>();

    int kitapNo=1000;
  public void kitapSecme(){
        System.out.println("***** KİTAP KURDUNA HOSGELDİNİZ*****");
        System.out.println(" Lütfen yapmak isstediğiniz islemi seciniz " +
                          " kitap eklemek icin 1\nkitap numarası ile kitap görüntülemek icin 2\nkitap bilgisi ile kitap görüntülemek icin 3\n" +
                          " kitap numarasi ile kitap silmek icin 4\ntüm kitapari listelemek icin\5cıkıs icin 6 ");

        int secim=scan.nextInt();
        switch (secim) {
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            default:
                System.out.println("hatali secim");
                kitapSecme();
        }





    }

    private void kitapEkleme() {




    }


}
