public class Dörtgen extends Shape {

    public Dörtgen(IRenk renk) {
        super(renk);
    }

    @Override
    public void ciz() {
        System.out.print("Dörtgen Çizildi. ");
        renk.fill();
    }
    
}
