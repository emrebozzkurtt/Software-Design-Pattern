public class App {
    public static void main(String[] args) throws Exception {
        CalisanListe yönetici = new CalisanListe("Yönetici");
        CalisanListe altYönetici1 = new CalisanListe("Alt Yönetici 1");
        CalisanListe altYönetici2 = new CalisanListe("Alt Yönetici 2");
        CalisanListe altYönetici3 = new CalisanListe("Alt Yönetici 3");
        yönetici.calisanAdd(altYönetici1);
        yönetici.calisanAdd(altYönetici2);
        yönetici.calisanAdd(altYönetici3);

        Calisan tasarımcı = new Calisan("Tasarımcı");
        Calisan grafiker = new Calisan("Grafiker");
        CalisanListe tasarımcı2 = new CalisanListe("Tasarımcı 2");

        altYönetici1.calisanAdd(tasarımcı);
        altYönetici1.calisanAdd(grafiker);
        altYönetici3.calisanAdd(tasarımcı2);

        Calisan tasarımcı3 = new Calisan("Tasarımcı 3");
        tasarımcı2.calisanAdd(tasarımcı3);
        yönetici.listele();
    }
}
