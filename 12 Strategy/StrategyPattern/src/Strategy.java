public abstract class Strategy {
    String tema;

    abstract int fiyatHesapla(int a);

    void arayüzSec(){
        System.out.println(tema + " indirimi belirlendi");
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
}
