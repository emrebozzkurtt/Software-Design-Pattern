public class Tasarimci implements ICalisan {
    private String isim;

    public Tasarimci() {
    }

    public Tasarimci(String isim) {
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
        System.out.println("Tasarimci");
        
    }
}
