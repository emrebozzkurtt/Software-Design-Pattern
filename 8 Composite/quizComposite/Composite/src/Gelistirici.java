public class Gelistirici implements ICalisan{

    private String isim;

    public Gelistirici() {
    }

    public Gelistirici(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Gelistirici");
        
    }

}
