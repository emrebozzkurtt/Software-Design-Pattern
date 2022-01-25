public class KrediKefil extends AbstractKrediKontrol {

    @Override
    public boolean krediKontrolEt(Musteri musteri) {
        if(musteri.isKrediKefil() == true){
            return true;
        }
        else{
            System.out.println("Kefiliniz Güvenilir Değil");
            return false;
        }
    }
    
}
