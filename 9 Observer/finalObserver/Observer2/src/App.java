public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        AbstractKullanici emre = new Musteri("Emre");
        AbstractKullanici berkay = new Musteri("Berkay");
        AbstractKullanici cuma = new Musteri("Cuma");

        AbstractUrun bilgisayar1 = new Bilgisayar("Bilgisayar1", 12500, "Monster");
        AbstractUrun bilgisayar2 = new Bilgisayar("Bilgisayar2", 15000, "ASUS");
        AbstractUrun saat1 = new Saat("Saat1", 600, "Siyah");
        AbstractUrun saat2 = new Saat("Saat2", 1000, "Yeşil");

        /*
        bilgisayar1.musteriEkle(emre);
        bilgisayar1.musteriEkle(cuma);
        bilgisayar2.musteriEkle(berkay);

        saat1.musteriEkle(emre);
        saat1.musteriEkle(cuma);
        saat2.musteriEkle(berkay);

        saat1.setIndirim(10);
        saat2.setIndirim(30);
        */

        emre.favoriEkle(bilgisayar1);
        emre.favoriEkle(bilgisayar2);
        emre.favoriEkle(saat1);
        
        cuma.favoriEkle(bilgisayar1);
        cuma.favoriEkle(saat1);
        
        berkay.favoriEkle(saat2);
        bilgisayar2.setIndirim(20);
        saat2.setIndirim(40);
        saat1.setIndirim(10);

        System.out.println("-------------------");

        emre.favListele();
        berkay.favListele();
    }
}
