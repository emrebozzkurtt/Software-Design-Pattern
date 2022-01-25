public abstract class KrediIstegi{
    private KrediIstegi sonrakiKredi;

    public void sonrakiIslemSetle(KrediIstegi istek){
        this.sonrakiKredi = istek;
    }

    public abstract boolean islemIcraEt(Musteri musteri);

    public boolean icraEt(Musteri musteri){
        
        if(islemIcraEt(musteri) == true){
            if( sonrakiKredi != null ){
                return sonrakiKredi.icraEt(musteri);
            }
            return true;
        }
        return false;
    }

}