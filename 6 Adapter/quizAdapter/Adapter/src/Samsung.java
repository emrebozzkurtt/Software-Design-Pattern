public class Samsung implements ITelefon {

    private int volt;

    public Samsung(){
        this.volt=12;
    }

    @Override
    public int sarjEt() {
        System.out.print("Samsung Telefon Sarj Oluyor.. volt => ");
        return volt;
    }
}
