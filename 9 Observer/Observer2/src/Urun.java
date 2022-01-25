import java.util.ArrayList;
import java.util.List;

public abstract class Urun{
    private String isim;
    private int fiyat;
    private List<Musteri> mList = new ArrayList<>();
    
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
        HaberVer();
    }

    public void MusteriEkle(Musteri musteri){
        mList.add(musteri);
    }

    public void MusteriSil(Musteri musteri){
        mList.remove(musteri);
    }
    
    public void HaberVer(){
        for (Musteri m : mList) {
            m.HaberAl(getIsim() +" fiyat güncellendi "+ m.getIsim());
        }
    }
}