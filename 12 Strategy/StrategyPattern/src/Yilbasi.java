public class Yilbasi extends Strategy {
    
    public Yilbasi() {
        super.tema = "Yılbaşı";
    }

    @Override
    public int fiyatHesapla(int a) {
        return a*80/100;
    }
}
