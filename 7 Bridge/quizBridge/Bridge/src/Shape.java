public abstract class Shape {
    protected IRenk renk;

    public Shape(IRenk renk) {
        this.renk = renk;
    }

    abstract public void ciz();
    
}
