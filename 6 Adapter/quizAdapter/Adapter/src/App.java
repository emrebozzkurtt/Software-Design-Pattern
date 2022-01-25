public class App {
    public static void main(String[] args) throws Exception {
        
        Priz priz = new Priz();

        Utu utu = new Utu();
        Buzdolabi buzdolabi = new Buzdolabi();

        priz.ElektrikVer(utu);
        priz.ElektrikVer(buzdolabi);

        Samsung telefon = new Samsung();
        Adapter adapter = new Adapter(telefon);
        priz.ElektrikVer(adapter);
    }
}
