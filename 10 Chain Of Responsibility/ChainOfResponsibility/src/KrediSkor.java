public class KrediSkor extends KrediKontrol {

    public KrediSkor() {
        this.setAsamaAdi("Kredi Skor");
    }

    @Override
    public void Kontrol(Musteri musteri) {
        if(musteri.getKrediSkor() > 1500){
            this.setDurum(true);
        }else{
            this.setDurum(false);
        }
        Sonuc(this, musteri);
    }
}
