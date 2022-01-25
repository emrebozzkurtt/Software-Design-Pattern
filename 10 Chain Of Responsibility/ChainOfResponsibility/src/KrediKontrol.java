public abstract class KrediKontrol{
    private KrediKontrol krediKontrol;
    private String asamaAdi;
    private boolean durum;

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    public void setAsamaAdi(String asamaAdi) {
        this.asamaAdi = asamaAdi;
    }

    public String getAsamaAdi() {
        return asamaAdi;
    }

    public KrediKontrol getNext() {
        return krediKontrol;
    }

    public void setNext(KrediKontrol krediKontrol) {
        this.krediKontrol = krediKontrol;
    }

    public abstract void Kontrol(Musteri musteri);

    public void Sonuc(KrediKontrol kredi, Musteri musteri){
        if(kredi.isDurum()){
            System.out.println(kredi.getAsamaAdi() + " aşaması kontrol edildi ve geçildi.");
            if(kredi.getNext() != null){
                kredi.getNext().Kontrol(musteri);
            }else{
                System.out.println("Kontrol aşaması sonlandı. Sonuç başarılı.");
            }
        }else{
            System.out.println(kredi.getAsamaAdi() + " nedeni ile kullanıcı kredi almaya uygun değil.");
        }
    }
    
}