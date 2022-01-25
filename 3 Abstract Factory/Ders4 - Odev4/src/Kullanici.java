interface KullaniciService {

    void urunGoruntule(Urun urun);
}

interface SatisYapabilenService {

    void urunEkle(Urun urun);
}

class Musteri implements KullaniciService, GirisYapService{

    private String musteriAd;

    public Musteri(String musteriAd){
        this.musteriAd = musteriAd;
    }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }


    @Override
    public void girisYap() {
        System.err.println(getMusteriAd() + " Adli Kullanici Giris Yapti");
        System.out.println();
    }

    @Override
    public void urunGoruntule(Urun urun) {
        System.out.println(urun.getIsim() + " - " + urun.getFiyat() + "   Goruntuleyen -> " + getMusteriAd());
        System.out.println();
    }

}

class Satici implements KullaniciService, SatisYapabilenService, GirisYapService{

    private String saticiAd;

    public Satici(String saticiAd) {
        this.saticiAd = saticiAd;
    }

    public String getSaticiAd() {
        return saticiAd;
    }

    public void setSaticiAd(String saticiAd) {
        this.saticiAd = saticiAd;
    }

    @Override
    public void urunEkle(Urun urun) {
        System.out.println(getSaticiAd() + " Urun Ekledi =>" + urun.getIsim());
        System.out.println();
    }

    @Override
    public void girisYap() {        
        System.err.println(getSaticiAd() + " Adli Kullanici Giris Yapti");
        System.out.println();
    }

    @Override
    public void urunGoruntule(Urun urun) {
        System.out.println(urun.getIsim() + " - " + urun.getFiyat() + "   Goruntuleyen -> " + getSaticiAd());
        System.out.println();
    }

}