public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        IUrun telefon = new Telefon("Samsung A50", 3000);
        IUrun monster = new Bilgisayar("Monster", 11000, "i7 9750H", "GTX 1660Ti");
        IUrun asus = new Bilgisayar("Asus", 17000, "i7 10750H", "GTX 2060");

        Kullanici kullanici1 = new Musteri("Emre");
        Kullanici kullanici2 = new Musteri("Yiğit");
        Kullanici kullanici3 = new Musteri("Samet");


        //Bu kısımda urunun kullanici listesine direk kullanicilari atıyoruz
        telefon.kEkle(kullanici1);
        telefon.kEkle(kullanici2);
        telefon.kEkle(kullanici3);

        monster.kEkle(kullanici1);

        asus.kEkle(kullanici2);
        asus.kEkle(kullanici3);

        asus.setIndirim(20);

        //Burada ise kullanicinin listesine atıyormuş gibi gosterip urunun listesine kullaniciyi atiyoruz
        Kullanici kullanici4 = new Musteri("Sefa");
        kullanici4.FavEkle(monster);

        monster.setIndirim(18);
        System.out.println("-----------------");
        kullanici4.UrunListele();
    }
}
