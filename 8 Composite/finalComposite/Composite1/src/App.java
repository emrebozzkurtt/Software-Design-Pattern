public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        ISekil kare = new Kare();
        ISekil ucgen = new Ucgen();
        ISekil dikdortgen = new Dikdortgen();

        Kalem kalem = new Kalem();
        kalem.addSekil(kare);
        kalem.addSekil(ucgen);
        kalem.addSekil(dikdortgen);

        kalem.draw("Kırmızı");
        kalem.clearSekiller();
        
        System.out.println("\n");

        kalem.addSekil(kare);
        kalem.addSekil(ucgen);
        kalem.draw("Yeşil");
    }
}
