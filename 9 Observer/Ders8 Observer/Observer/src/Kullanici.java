import java.util.ArrayList;
import java.util.List;

public abstract class Kullanici {
    
    private String isim;
    private List<IUrun> urunList = new ArrayList<IUrun>();

    public Kullanici() {
    }

    public Kullanici(String isim) {
        this.isim = isim;
    }

    public void FavEkle(IUrun urun) {
        urun.kEkle(this);
        urunList.add(urun);
    }

    public void UrunListele() {
        System.out.println(getIsim() + " Favori Listesi");
        for (IUrun iUrun : urunList) {
            System.out.println(iUrun.toString());
        }
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void HaberAl(String mesaj) {
        System.out.println(mesaj);
    }
}
