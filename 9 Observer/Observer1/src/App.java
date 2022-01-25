public class App {
    public static void main(String[] args) throws Exception {
        Urun urun1 = new Urun("Ürün1",500);
        Urun urun2 = new Urun("Ürün2", 300);

        Musteri musteri = new Musteri("Yiğit");
        musteri.UrunEkle(urun1);

        urun1.setFiyat(600);
        urun2.setFiyat(500);

    }
}
