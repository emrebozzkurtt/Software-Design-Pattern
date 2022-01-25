public class Priz {
    public void ElektrikVer(IElektirkliEvAleti elektirkliEvAleti){
        int volt = elektirkliEvAleti.prizeTakCalistir();
        System.out.println("Prizden : " + volt);
    }
}
