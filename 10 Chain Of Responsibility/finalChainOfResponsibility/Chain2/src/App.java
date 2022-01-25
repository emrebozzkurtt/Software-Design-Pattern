public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Musteri musteri = new Musteri(2000, 2, 4000, true);

        KrediKontrol krediSkor = new KrediSkor();
        KrediKontrol odemeGecikmesi = new OdemeGecikmesi();
        KrediKontrol maasKontrol = new MaasKontrol();
        KrediKontrol kefilKontrol = new KefilKontrol();

        krediSkor.setNextKontrol(odemeGecikmesi);
        odemeGecikmesi.setNextKontrol(maasKontrol);
        maasKontrol.setNextKontrol(kefilKontrol);

        krediSkor.Kontrol(musteri);

        System.out.println(odemeGecikmesi.getNext().getAsamaAdi());
    }
}
