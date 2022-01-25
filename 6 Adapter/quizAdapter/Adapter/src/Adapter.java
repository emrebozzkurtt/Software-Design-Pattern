public class Adapter implements IElektirkliEvAleti {

    private Samsung telefon;
    
    public Adapter(Samsung telefon){
        this.telefon = telefon;
    }

    @Override
    public int prizeTakCalistir() {
        return telefon.sarjEt();
    }
    
}
