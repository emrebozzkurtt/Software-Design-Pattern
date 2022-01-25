public class Haftasonu extends Strategy {

    public Haftasonu() {
        super.tema = "Haftasonu";
    }

    @Override
    public int fiyatHesapla(int a) {
        return a*90/100;
    }
}
