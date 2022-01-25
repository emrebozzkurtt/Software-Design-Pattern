import java.util.ArrayList;
import java.util.List;

public abstract class AbstractKullanici {

    private String isim;
    private List<AbstractUrun> urunList = new ArrayList<>();

    public AbstractKullanici(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void HaberAl(String message) {
        System.out.println(message);
    }

    public void favoriEkle(AbstractUrun urun) {
        urun.kullaniciEkle(this);
        urunList.add(urun);
    }

    public void favListele() {
        System.out.println(getIsim() + " Favori Listesi");
        for (AbstractUrun urun : urunList) {
            System.out.println(urun.getUrunAdi() + " - " + urun.getFiyat());
        }
        System.out.println();
    }
}
