import java.util.ArrayList;
import java.util.List;

public class InsanKaynaklari implements ICalisan {

    private List<ICalisan> calisanlar = new ArrayList<ICalisan>();

    public InsanKaynaklari() {
    }

    public void CalisanEkle(ICalisan calisan) {
        calisanlar.add(calisan);
    }

    public void CalisanSil(ICalisan calisan) {
        calisanlar.remove(calisan);
    }

    @Override
    public void bilgiGoster() {
        
        for (ICalisan calisan : calisanlar) {
            System.out.print("*");
            calisan.bilgiGoster();
        }
    }
    
}
