import java.util.ArrayList;
import java.util.List;

public class VeriTabani {
    
    private List<KullaniciService> kullanicilar;
    private List<Urun> urunler;
    private static VeriTabani veriTabani = new VeriTabani();

    public VeriTabani(){
        kullanicilar = new ArrayList<>();
        urunler = new ArrayList<>();
    }

    public void kullaniciEkle(KullaniciService kullanici){
        kullanicilar.add(kullanici);
    }

    public void urunEkle(Urun urun){
        urunler.add(urun);
    }

    public void kullaniciGoster(){
        for (KullaniciService kullanici:kullanicilar) {
            System.out.println(kullanici);
        }
    }

    public void urunGoster(){
        for (Urun urun:urunler) {
            System.out.println(urun.getIsim() + " " + urun.getFiyat() + "₺");
        }
    }

    public static VeriTabani getVeriTabani() {
        return veriTabani;
    }    
}
