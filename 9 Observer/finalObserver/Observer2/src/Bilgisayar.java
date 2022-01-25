public class Bilgisayar extends AbstractUrun {
    
    private String marka;

    public Bilgisayar(String urunAdi, int fiyat, String marka) {
        super(urunAdi, fiyat);
        this.marka = marka;    
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    
}
