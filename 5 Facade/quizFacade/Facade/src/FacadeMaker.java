public class FacadeMaker {
    private IShape kare;
    private IShape dikdortgen;
    private IShape cember;

    public FacadeMaker() {
        this.kare = new Kare();
        this.dikdortgen = new Dikdortgen();
        this.cember = new Cember();
    }

    public void kareCiz() {
        kare.draw();
    }
    
    public void dikdortgenCiz() {
        dikdortgen.draw();
    }

    public void cemberCiz() {
        cember.draw();
    }
}
