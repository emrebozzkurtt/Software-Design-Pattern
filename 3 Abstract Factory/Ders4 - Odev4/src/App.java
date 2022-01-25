public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println();
        
        Urun bilgisayar = new Urun("Bilgisayar", 12500);
        Urun telefon = new Urun("Telefon", 4799);

        Musteri musteri = new Musteri("Emre");
        Satici satici = new Satici("Samet");

        satici.girisYap();

        satici.urunEkle(bilgisayar);
        satici.urunEkle(telefon);

        musteri.girisYap();

        musteri.urunGoruntule(bilgisayar);
        satici.urunGoruntule(telefon);
    }
}
