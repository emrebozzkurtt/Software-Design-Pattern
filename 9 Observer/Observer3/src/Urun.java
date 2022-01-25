import java.util.ArrayList;
import java.util.List;

public abstract class Urun {
    private String isim;
    private int fiyat;
    private List<Kullanici> mList;

    public Urun() {
        mList = new ArrayList<>();
    }

    public Urun(String isim, int fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
        mList = new ArrayList<>();
    }

    public void HaberVer(int fiyat){
        for (Kullanici musteri : mList) {
            musteri.HaberAl(isim + " fiyatı değişti. -> " + musteri.getIsim() );
            
            if(this.fiyat/2>fiyat){
                System.out.println("Ürün satın alınabilir.");
            }
        }
    }

    public void MusteriEkle(Kullanici musteri){
        mList.add(musteri);
    }

    public void MusteriSil(Kullanici musteri){
        mList.add(musteri);
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
        HaberVer(fiyat);
        this.fiyat = fiyat;
    }

    
}
