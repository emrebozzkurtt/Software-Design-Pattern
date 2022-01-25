import java.util.ArrayList;
import java.util.List;

public class Kalem implements ISekil {
    private List<ISekil> sekilListe = new ArrayList<>();

    public void addSekil(ISekil sekil) {
        sekilListe.add(sekil);
    }

    public void removeSekil(ISekil sekil) {
        sekilListe.add(sekil);
    }

    public void clearSekiller() {
        sekilListe.clear();
    }

    @Override
    public void draw(String renk) {
        for (ISekil iSekil : sekilListe) {
            iSekil.draw(renk);
        }
    }
}
