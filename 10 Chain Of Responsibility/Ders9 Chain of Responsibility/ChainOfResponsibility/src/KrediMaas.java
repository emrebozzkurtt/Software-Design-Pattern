public class KrediMaas extends AbstractKrediKontrol {

    @Override
    public boolean krediKontrolEt(Musteri musteri) {
        if(musteri.getMaas() >= 2000){
            return true;
        }
        else{
            System.out.println("Maaşınız Yeterli Değil");
            return false;
        }
    }
    
}
