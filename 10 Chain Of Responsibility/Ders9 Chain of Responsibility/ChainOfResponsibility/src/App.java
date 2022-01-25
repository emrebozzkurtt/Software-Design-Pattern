import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<AbstractKrediKontrol> islemler = new ArrayList<>();
        islemler.add(new KrediSkor());
        islemler.add(new KrediMaas());
        islemler.add(new KrediGecikmesi());
        islemler.add(new KrediKefil());
        boolean krediUygunluk = true;

        Musteri musteri = new Musteri(2000,3000,5,true);
        
        for (AbstractKrediKontrol islem : islemler) {
            krediUygunluk = islem.krediKontrolEt(musteri);

            if(krediUygunluk == false){
                System.out.println("Kredi Alma Koşullarını Karşılayamadınız!!");
                break;
            }
        }

        if(krediUygunluk == true){
            System.out.println("Kredi Alabilirsiniz..");
        }

    }
}
