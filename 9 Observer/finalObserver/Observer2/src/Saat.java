public class Saat extends AbstractUrun {
    
    private String renk;

    public Saat(String urunAdi, int fiyat, String renk) {
        super(urunAdi, fiyat);
        this.renk = renk;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

}
