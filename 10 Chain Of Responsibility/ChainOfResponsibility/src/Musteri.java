public class Musteri {
    private int krediSkor, odemeGecikmesi,maas;
    private boolean kefil;

    public Musteri(int krediSkor, int odemeGecikmesi, Boolean kefil, int maas) {
        this.krediSkor = krediSkor;
        this.odemeGecikmesi = odemeGecikmesi;
        this.kefil = kefil;
        this.maas = maas;
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

    public boolean getKefil() {
        return kefil;
    }

    public void setKefil(Boolean kefil) {
        this.kefil = kefil;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }
    
}
