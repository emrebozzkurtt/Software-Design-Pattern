public class Musteri {
    private int krediSkor, maas, krediGecikmesi;
    private boolean krediKefil;

    public Musteri() {
    }

    public Musteri(int krediSkor, int maas, int krediGecikmesi, boolean krediKefil) {
        this.krediSkor = krediSkor;
        this.maas = maas;
        this.krediGecikmesi = krediGecikmesi;
        this.krediKefil = krediKefil;
    }

    public int getKrediSkor() {
        return krediSkor;
    }

    public void setKrediSkor(int krediSkor) {
        this.krediSkor = krediSkor;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getKrediGecikmesi() {
        return krediGecikmesi;
    }

    public void setKrediGecikmesi(int krediGecikmesi) {
        this.krediGecikmesi = krediGecikmesi;
    }

    public boolean isKrediKefil() {
        return krediKefil;
    }

    public void setKrediKefil(boolean krediKefil) {
        this.krediKefil = krediKefil;
    }
    
}
