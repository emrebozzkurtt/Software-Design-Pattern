import java.util.ArrayList;
import java.util.List;

public abstract class IUrun {
    
    private String urunAdi;
    private float fiyat;
    private int indirim;
    private List<Kullanici> kList = new ArrayList<Kullanici>();

    public IUrun() {
    }

    public IUrun(String urunAdi, int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public float getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getIndirim() {
        return indirim;
    }

    public void setIndirim(int indirim) {
        this.indirim = indirim;
        this.fiyat = getFiyat() - ((fiyat*indirim)/100);
        HaberVer();
    }

    public void HaberVer() {
        for (Kullanici kullanici : kList) {
            kullanici.HaberAl("Fiyat Güncellemesi -> " + toString() + " Bildirim -> " + kullanici.getIsim());
        }
    }
    
    public void kEkle(Kullanici kullanici) {
        kList.add(kullanici);
    }

    public void kSil(Kullanici kullanici) {
        kList.remove(kullanici);
    }

    @Override
    public String toString() {
        return "Urun [fiyati= " + fiyat + ", urunAdi= " + urunAdi + "]";
    }
}
