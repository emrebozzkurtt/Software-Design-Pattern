public class App {
    public static void main(String[] args) throws Exception {
        Musteri musteri1 = new Musteri(2000, 1, true, 3500);
        Musteri musteri2 = new Musteri(2000, 1, true, 2500);

        KrediKontrol krediSkor = new KrediSkor();
        KrediKontrol odemeGecikmesi = new OdemeGecikmesi();
        KrediKontrol kefilKontrol = new KefilKontrol();
        KrediKontrol maasKontrol = new MaasKontrol();

        krediSkor.setNext(odemeGecikmesi);
        odemeGecikmesi.setNext(kefilKontrol);
        kefilKontrol.setNext(maasKontrol);

        System.out.println("\n");
        krediSkor.Kontrol(musteri1);
        System.out.println("\n");
        krediSkor.Kontrol(musteri2);
        System.out.println("\n");
    }
}
