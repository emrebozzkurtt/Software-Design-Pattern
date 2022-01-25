public class Ev {
    
    private String il;
    private String ilce;
    private String mahalle;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int binaYili;
    private boolean isDublex;
    private boolean isEsyali;

    public Ev() {
        
    }

    public Ev(String il, String ilce, String mahalle, int odaSayisi, int banyoSayisi, int tuvaletSayisi, int binaYili,
            boolean isDublex, boolean isEsyali) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.binaYili = binaYili;
        this.isDublex = isDublex;
        this.isEsyali = isEsyali;
    }

    @Override
    public String toString() {
        return "Ev [banyoSayisi=" + banyoSayisi + ", binaYili=" + binaYili + ", il=" + il + ", ilce=" + ilce
                + ", isDublex=" + isDublex + ", isEsyali=" + isEsyali + ", mahalle=" + mahalle + ", odaSayisi="
                + odaSayisi + ", tuvaletSayisi=" + tuvaletSayisi + "]";
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public int getBinaYili() {
        return binaYili;
    }

    public void setBinaYili(int binaYili) {
        this.binaYili = binaYili;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean isDublex) {
        this.isDublex = isDublex;
    }

    public boolean isEsyali() {
        return isEsyali;
    }

    public void setEsyali(boolean isEsyali) {
        this.isEsyali = isEsyali;
    }

    
    
}
