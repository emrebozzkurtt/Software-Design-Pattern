public class App {
    public static void main(String[] args) throws Exception {
        Urun urun1 = new Bilgisayar("i7","urun1", 300);
        Urun urun2 = new Saat("Kırmızı","Urun2",500);

        Musteri musteri = new Musteri("Yiğit");
        Musteri musteri2 = new Musteri("Samet");

        musteri.FavoriEkle(urun1);
        musteri2.FavoriEkle(urun2);

        urun1.setFiyat(2000);
        urun2.setFiyat(10);
    }
}
