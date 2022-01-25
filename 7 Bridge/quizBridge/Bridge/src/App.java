public class App {
    public static void main(String[] args) throws Exception {

        Shape dörtgen = new Dörtgen(new Red());
        dörtgen.ciz();
        Shape ucgen = new Ucgen(new Blue());
        ucgen.ciz();
    }
}
