package P09_kitapYonetimiTeam;





    public class K02_KutuphaneYoneticisi{//en baba class
        public int kitapNo;
        public String kitapAdi;
        public String yazarAdi;
        public String kitapFiyati;
        public String kitapRafNo;

        public K02_KutuphaneYoneticisi() {

        }

        public K02_KutuphaneYoneticisi(int kitapNo, String kitapAdi, String yazarAdi, String kitapFiyati, String kitapRafNo) {
            this.kitapNo = kitapNo;
            this.kitapAdi = kitapAdi;
            this.yazarAdi = yazarAdi;
            this.kitapFiyati = kitapFiyati;
            this.kitapRafNo = kitapRafNo;
        }

        public K02_KutuphaneYoneticisi(String kitapAdi, String yazarAdi) {
            this.kitapAdi = kitapAdi;
            this.yazarAdi = yazarAdi;
        }//bagıs yapanlarin yaptipi bagısı eklemek icin yazdim

        public int getKitapNo() {
            return kitapNo;
        }

        public void setKitapNo(int kitapNo) {
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

        public String getKitapFiyati() {
            return kitapFiyati;
        }

        public void setKitapFiyati(String kitapFiyati) {
            this.kitapFiyati = kitapFiyati;
        }

        public String getKitapRafNo() {
            return kitapRafNo;
        }

        public void setKitapRafNo(String kitapRafNo) {
            this.kitapRafNo = kitapRafNo;
        }

        @Override
        public String toString() {
            return "{" +
                    "kitapNo=" + kitapNo +
                    ", kitapAdi='" + kitapAdi + '\'' +
                    ", yazarAdi='" + yazarAdi + '\'' +
                    ", kitapFiyati='" + kitapFiyati + '\'' +
                    ", kitapRafNo='" + kitapRafNo + '\'' +
                    '}';
        }
    }

