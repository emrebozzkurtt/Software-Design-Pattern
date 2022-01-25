public class KefilKontrol extends KrediKontrol {

    public KefilKontrol() {
        this.setAsamaAdi("Kefil Kontrol");
    }

    @Override
    public void Kontrol(Musteri musteri) {
        if(musteri.getKefil()){
            this.setDurum(true);
        }else{
            this.setDurum(false);
        }
        Sonuc(this, musteri);
        
    }
    
}
