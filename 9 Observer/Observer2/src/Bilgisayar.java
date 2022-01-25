public class Bilgisayar extends Urun {
    String islemci;

    public Bilgisayar(String islemci,String isim, int fiyat){
        super(isim,fiyat);
        this.islemci = islemci;  
    }
}
