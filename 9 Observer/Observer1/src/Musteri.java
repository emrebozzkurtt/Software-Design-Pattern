import java.util.ArrayList;
import java.util.List;

public class Musteri {
    private String isim;
    private static List<Urun> uList = new ArrayList<>();

    public static void Haber(Urun urun){
        if (uList.contains(urun)){
            System.out.println(urun + " fiyatı güncellendi.");
        }
    }

    public Musteri() {
    }
    public Musteri(String isim) {
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public void UrunEkle(Urun urun){
        uList.add(urun);
    }
    public void UrunSil(Urun urun){
        uList.remove(urun);
    }
}
