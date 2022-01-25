public class Ucgen extends Shape {

    public Ucgen(IRenk renk) {
        super(renk);
    }

    @Override
    public void ciz() {
        System.out.print("Üçgen Çizildi. ");
        renk.fill(); 
    }
    
}
