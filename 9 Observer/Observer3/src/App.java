public class App {
    public static void main(String[] args) throws Exception {
        Urun urun1 = new Araba("Araba", 50000);
        Urun urun2 = new Ev("Ev", 500000);
        Urun urun3 = new Bilgisayar("Bilgisayar", 10000);

        Kullanici ertan = new Musteri("Ertan");
        Kullanici yigit = new Musteri("Yiğit");
        Kullanici arman = new Musteri("Arman");

        ertan.favEkle(urun1);
        
        yigit.favEkle(urun2);

        arman.favEkle(urun3);
        arman.favEkle(urun2);
        arman.favEkle(urun1);

        urun1.setFiyat(30000);
        urun2.setFiyat(200000);
        urun3.setFiyat(10);

    }
}
