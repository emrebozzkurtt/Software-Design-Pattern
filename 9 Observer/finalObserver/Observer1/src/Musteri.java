import java.util.ArrayList;
import java.util.List;

public class Musteri {

    private String isim;
    private static List<Urun> urunList = new ArrayList<>();
    
    public Musteri(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void urunEkle(Urun urun){
        urunList.add(urun);
    }

    public void urunSil(Urun urun){
        urunList.remove(urun);
    }

    public static void Haber(Urun urun){
        if(urunList.contains(urun)){
            System.out.println(urun.getIsim() + " fiyatı güncellendi => " + urun.getFiyat());
        }
    }
    
}
