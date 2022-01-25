public class Urun {
    private String isim;
    private int fiyat;
    
    public Urun() {
    }
    public Urun(String isim, int fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getFiyat() {
        return fiyat;
    }
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
        Musteri.Haber(this);
    }
    @Override
    public String toString() {
        return  isim ;
    }
}
