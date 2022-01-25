public class Musteri {
    private int krediSkor, odemeGecikmesi,maas;
    private boolean kefil;
    
    public Musteri(int krediSkor, int odemeGecikmesi, int maas, boolean kefil) {
        this.krediSkor = krediSkor;
        this.odemeGecikmesi = odemeGecikmesi;
        this.maas = maas;
        this.kefil = kefil;
    }

    public int getKrediSkor() {
        return krediSkor;
    }

    public void setKrediSkor(int krediSkor) {
        this.krediSkor = krediSkor;
    }

    public int getOdemeGecikmesi() {
        return odemeGecikmesi;
    }

    public void setOdemeGecikmesi(int odemeGecikmesi) {
        this.odemeGecikmesi = odemeGecikmesi;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public boolean isKefil() {
        return kefil;
    }

    public void setKefil(boolean kefil) {
        this.kefil = kefil;
    }

    
}
