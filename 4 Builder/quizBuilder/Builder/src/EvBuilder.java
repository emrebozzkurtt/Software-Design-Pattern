public class EvBuilder {
    
    private String il;
    private String ilce;
    private String mahalle;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int binaYili;
    private boolean isDublex;
    private boolean isEsyali;

    public static EvBuilder startNormalEvBuild(String _il, String _ilce, String _mahalle, int _binaYili){
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = _il;
        evBuilder.ilce = _ilce;
        evBuilder.mahalle = _mahalle;
        evBuilder.binaYili =_binaYili;
        return evBuilder;
    }

    public static EvBuilder startDublexEvBuild(String _il, String _ilce, String _mahalle, int _binaYili){
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = _il;
        evBuilder.ilce = _ilce;
        evBuilder.mahalle = _mahalle;
        evBuilder.binaYili =_binaYili;
        evBuilder.isDublex = true;
        return evBuilder;
    }

    public Ev buildEv(){
        Ev ev = new Ev();

        ev.setIl(il);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setBinaYili(binaYili);
        ev.setDublex(isDublex);
        ev.setEsyali(isEsyali);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);    
        ev.setOdaSayisi(odaSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);

        return ev;
    }
    
    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setDublex(boolean isDublex) {
        this.isDublex = isDublex;
        return this;
    }

    public EvBuilder setEsyali(boolean isEsyali) {
        this.isEsyali = isEsyali;
        return this;
    }

    
}
