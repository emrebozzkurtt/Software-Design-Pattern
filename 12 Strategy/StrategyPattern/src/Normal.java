public class Normal extends Strategy{

    public Normal() {
        super.tema = "Normal";
    }

    @Override
    public int fiyatHesapla(int a) {
        return a;
    }
}