import java.util.ArrayList;
import java.util.List;

public abstract class AbstractUrun {
    private String urunAdi;
    private int fiyat;
    private List<AbstractKullanici> kullaniciList = new ArrayList<>();

    public AbstractUrun() {
    }

    public AbstractUrun(String urunAdi, int fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
    
    public void setIndirim(int oran) {
        this.fiyat = getFiyat() - ( (getFiyat()*oran)/100 );
        Bildirim();
    }

    public void kullaniciEkle(AbstractKullanici kullanici) {
        kullaniciList.add(kullanici);
    }

    public void kullaniciSil(AbstractKullanici kullanici) {
        kullaniciList.remove(kullanici);
    }
    
    public void Bildirim() {
        for (AbstractKullanici kullanici : kullaniciList) {
            kullanici.HaberAl(kullanici.getIsim() + "\t" + getUrunAdi() + " Fiyatı Güncellendi => " + getFiyat());
        }
        System.out.println();
    }    
}
