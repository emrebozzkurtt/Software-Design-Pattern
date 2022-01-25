public class KrediGecikmesi extends AbstractKrediKontrol {

    @Override
    public boolean krediKontrolEt(Musteri musteri) {
        if(musteri.getKrediGecikmesi() < 3){
            return true;
        }
        else{
            System.out.println("Kredi Gecikmesi Uygun Değil");
            return false;
        }
    }

}
