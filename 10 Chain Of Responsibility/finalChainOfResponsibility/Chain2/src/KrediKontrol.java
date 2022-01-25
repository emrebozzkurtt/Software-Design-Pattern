public abstract class KrediKontrol {
    private KrediKontrol krediKontrol;
    private String asamaAdi;
    private boolean durum;


    public String getAsamaAdi() {
        return asamaAdi;
    }
    public void setAsamaAdi(String asamaAdi) {
        this.asamaAdi = asamaAdi;
    }
    public boolean isDurum() {
        return durum;
    }
    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    public KrediKontrol getNext(){
        return krediKontrol;
    }

    public void setNextKontrol(KrediKontrol krediKontrol) {
        this.krediKontrol = krediKontrol;
    }

    abstract void Kontrol(Musteri musteri);

    public void Sonuc(KrediKontrol kredi, Musteri musteri) {
        if(kredi.isDurum()){
            System.out.println(kredi.getAsamaAdi() + " Aşaması Geçildi");
            if(kredi.getNext() != null){
                kredi.getNext().Kontrol(musteri);
            }
            else{
                System.out.println("Kredi Alabilir");
            }
        }
        else{
            System.out.println(kredi.getAsamaAdi() + " Aşamasını Geçemedi");
        }
    }
}
