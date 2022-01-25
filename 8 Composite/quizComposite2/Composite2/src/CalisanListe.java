import java.util.ArrayList;
import java.util.List;

public class CalisanListe implements IBilgi {

    private String cName;
    private List<IBilgi> calisanlar;
    
    public CalisanListe(String cName) {
        this.cName = cName;
        this.calisanlar = new ArrayList<IBilgi>();
    }

    public void calisanAdd(IBilgi calisan){
        calisanlar.add(calisan);
    }

    @Override
    public void listele() {
        System.out.println("- "+cName);
        for (IBilgi calisan : calisanlar) {
            calisan.listele();
        }
        System.out.println();
    }
    
}
