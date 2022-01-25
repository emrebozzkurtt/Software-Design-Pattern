import java.util.ArrayList;
import java.util.List;

public abstract class Kullanici {
    private String isim;
    private List<Urun> uList;
    

    public Kullanici() {
        uList = new ArrayList<>();
    }

    public Kullanici(String isim) {
        this.isim = isim;
        uList = new ArrayList<>();
    }

    public void HaberAl(String message){
        System.out.println(message);
    }

    public void favEkle(Urun urun){
        uList.add(urun);
        urun.MusteriEkle(this);
    }

    public void favSil(Urun urun){
        uList.remove(urun);
        urun.MusteriSil(this);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    
}
