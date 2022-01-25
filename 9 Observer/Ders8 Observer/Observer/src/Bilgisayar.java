public class Bilgisayar extends IUrun{
    private String islemci;
    private String ekranKarti;

    public Bilgisayar(String urunAdi, int fiyat, String islemci, String ekranKarti) {
        super(urunAdi, fiyat);
        this.islemci = islemci;
        this.ekranKarti = ekranKarti;
    }

    public String getIslemci() {
        return islemci;
    }

    public void setIslemci(String islemci) {
        this.islemci = islemci;
    }

    public String getEkranKarti() {
        return ekranKarti;
    }

    public void setEkranKarti(String ekranKarti) {
        this.ekranKarti = ekranKarti;
    }

    
    
    
}
