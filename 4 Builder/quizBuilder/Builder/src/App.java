public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Ev oluştururken zorunlu olması gerekenler
        Ev ev = EvBuilder.startNormalEvBuild("İstanbul","Ümraniye","Dudullu",14)
            .setOdaSayisi(3)
            .setEsyali(true)
            .setTuvaletSayisi(1)
            .buildEv();

        printEv(ev);

        Ev ev2 = EvBuilder.startDublexEvBuild("İstanbul","Ümraniye","Dudullu",14)
            .setBanyoSayisi(2)
            .setEsyali(false)
            .setTuvaletSayisi(1)
            .buildEv();

        printEv(ev2);
    }

    private static void printEv(Ev ev){
        System.out.println();
        System.out.println("Ev Eklendi -> " + ev);
        System.out.println();
    }
}
