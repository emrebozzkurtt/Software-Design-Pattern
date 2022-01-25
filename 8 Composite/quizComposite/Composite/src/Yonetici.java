public class Yonetici implements ICalisan {
    private String isim;

    public Yonetici() {
    }

    public Yonetici(String isim) {
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
        System.out.println("Yonetici");
        
    }
}
