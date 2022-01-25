public interface Duzen {
    void FiyatHesapla(double fiyat);
    void TasarimGoster(String tasarim);
}

class Standart implements Duzen{

    private double fiyat = 10;
    private String tasarim = "Standart Düzen ";

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getTasarim() {
        return tasarim;
    }

    public void setTasarim(String tasarim) {
        this.tasarim = tasarim;
    }

    @Override
    public void FiyatHesapla(double fiyat) {
        System.out.println(getFiyat());        
    }

    @Override
    public void TasarimGoster(String tasarim) {
        System.out.println(getTasarim());        
    }

}

class Yilbasi implements Duzen{

    private double fiyat = 10;
    private String tasarim = "Yibasi Düzen ";
    
    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getTasarim() {
        return tasarim;
    }

    public void setTasarim(String tasarim) {
        this.tasarim = tasarim;
    }

    @Override
    public void FiyatHesapla(double fiyat) {
        System.out.println(this.fiyat*0.7);       
    }

    @Override
    public void TasarimGoster(String tasarim) {
        System.out.println(this.tasarim);        
    }

}

class Haftasonu implements Duzen{

    private double fiyat = 10;
    private String tasarim = "Haftasonu Düzen ";
    
    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getTasarim() {
        return tasarim;
    }

    public void setTasarim(String tasarim) {
        this.tasarim = tasarim;
    }

    @Override
    public void FiyatHesapla(double fiyat) {
        System.out.println(this.fiyat*0.97);       
    }

    @Override
    public void TasarimGoster(String tasarim) {
        System.out.println(this.tasarim);        
    }
}

class Magaza{

    private Duzen duzen;

    public Duzen getDuzen() {
        return duzen;
    }

    public void setDuzen(Duzen duzen) {
        this.duzen = duzen;
    }

    public void FiyatHesapla(double fiyat) {
        duzen.FiyatHesapla(fiyat);
    }
    
    public void TasarimiGoster(String tasarim) {
        duzen.TasarimGoster(tasarim);
    }
}