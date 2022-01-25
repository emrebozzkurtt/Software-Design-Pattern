public class Calisan implements IBilgi {
    private String name;

    public Calisan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void listele() {
        System.out.println("-- " + name);
    }
    
}