public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Urun urun1 = new Urun("telefon", 3500);
        Urun urun2 = new Urun("bilgisayar", 12500);
        Urun urun3 = new Urun("kalem", 85);

        Musteri emre = new Musteri("Emre");
        Musteri hakan = new Musteri("Hakan");
        Musteri busra = new Musteri("Büşra");

        emre.urunEkle(urun1);
        emre.urunEkle(urun2);
        emre.urunEkle(urun3);

        hakan.urunEkle(urun2);
        hakan.urunEkle(urun3);

        busra.urunEkle(urun1);
    
        urun2.setIndirim(20);
        urun1.setIndirim(20);


    }
}
