public class KrediSkor extends AbstractKrediKontrol {

    @Override
    public boolean krediKontrolEt(Musteri musteri) {
        if(musteri.getKrediSkor() >= 1500){
            return true;
        }
        else{
            System.out.println("Kredi Skorunuz Uygun Değil");
            return false;
        }
    }
    
}
