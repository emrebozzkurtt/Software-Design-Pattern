public class Musteri {
    private String isim;

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

    public void HaberAl(String message){
        System.out.println(message);
    }

    public void FavoriEkle(Urun urun){
        urun.MusteriEkle(this);
    }
}
