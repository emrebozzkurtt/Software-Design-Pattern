public class Urun {

    private String urunAdi;
    private int fiyat;
    
    public Urun() {
    }

    public Urun(String urunAdi, int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return urunAdi;
    }

    public void setIsim(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    
    public void setIndirim(int oran) {
        if(oran < 100 && oran > 0){
            this.fiyat = fiyat - ((fiyat*oran)/100);
            Musteri.Haber(this);
        }
        else{
            System.out.println("Geçersiz İndirim");
        }
    }
    
}
