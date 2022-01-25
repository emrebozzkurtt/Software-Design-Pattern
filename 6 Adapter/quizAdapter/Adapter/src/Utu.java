public class Utu implements IElektirkliEvAleti{
    private int volt;

    public Utu() {
        this.volt = 220;
    }

    @Override
    public int prizeTakCalistir() {
        System.out.print("Utu Calisti. Volt => ");
        return volt;
    }

    
}
