public class MaasKontrol extends KrediKontrol {

    public MaasKontrol() {
        this.setAsamaAdi("Maaş Kontrol");
    }

    @Override
    void Kontrol(Musteri musteri) {
        if(musteri.getMaas() > 3000){
            this.setDurum(true);
        }
        else{
            this.setDurum(false);
        }
        Sonuc(this, musteri);
    }
}
