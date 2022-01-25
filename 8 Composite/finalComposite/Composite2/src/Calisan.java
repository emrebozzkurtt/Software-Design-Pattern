public class Calisan implements IBilgiGoster {
    private String meslek;

    public Calisan(String meslek) {
        this.meslek = meslek;
    }

    public String getMeslek() {
        return meslek;
    }

    public void setMeslek(String meslek) {
        this.meslek = meslek;
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Meslek -> " + getMeslek());        
    }
    
}
