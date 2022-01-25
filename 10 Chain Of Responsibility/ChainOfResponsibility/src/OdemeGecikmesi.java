public class OdemeGecikmesi extends KrediKontrol {

    public OdemeGecikmesi() {
        this.setAsamaAdi("Ödeme Gecikmesi");
    }

    @Override
    public void Kontrol(Musteri musteri) {
        if(musteri.getOdemeGecikmesi() < 3 ){
            this.setDurum(true);
        }else{
            this.setDurum(false);
        }
        Sonuc(this, musteri);
    }
}
