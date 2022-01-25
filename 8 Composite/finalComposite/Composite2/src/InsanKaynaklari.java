import java.util.ArrayList;
import java.util.List;

public class InsanKaynaklari implements IBilgiGoster {

    private String groupName;
    
    private List<IBilgiGoster> calisanListe = new ArrayList<>();

    public InsanKaynaklari(String groupName) {
        this.groupName = groupName;
    }
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void calisanAdd(IBilgiGoster calisan) {
        calisanListe.add(calisan);
    }
    
    public void calisanRemove(IBilgiGoster calisan) {
        calisanListe.remove(calisan);
    }
    
    public void calisanClear(IBilgiGoster calisan) {
        calisanListe.clear();
    }

    @Override
    public void bilgiGoster() {
        System.out.println(getGroupName());
        for (IBilgiGoster iCalisan : calisanListe) {
            iCalisan.bilgiGoster();
        }     
        System.out.println();   
    }    
}
