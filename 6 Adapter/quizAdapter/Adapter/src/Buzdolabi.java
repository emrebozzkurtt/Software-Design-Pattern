public class Buzdolabi implements IElektirkliEvAleti{
    private int volt;

    public Buzdolabi() {
        this.volt = 220;
    }

    @Override
    public int prizeTakCalistir() {
        System.out.print("Buzdolabi Calisti. Volt => ");
        return volt;
    }
    
}
