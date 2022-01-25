public class KefilKontrol extends KrediKontrol {

    public KefilKontrol() {
        this.setAsamaAdi("Kefil Kontrol");
    }

    @Override
    void Kontrol(Musteri musteri) {
        if(musteri.isKefil()){
            this.setDurum(true);
        }
        else{
            this.setDurum(false);
        }
        Sonuc(this, musteri);
    }
}
