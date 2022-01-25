public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        InsanKaynaklari yonetici = new InsanKaynaklari("Yönetici");
        InsanKaynaklari ekip1 = new InsanKaynaklari("Ekip 1");
        InsanKaynaklari ekip2 = new InsanKaynaklari("Ekip 2");
        InsanKaynaklari ekip3 = new InsanKaynaklari("Ekip 3");
        
        Calisan tasarimci = new Calisan("Tasarımcı");
        Calisan grafiker = new Calisan("Grafiker");
        Calisan yazilimci = new Calisan("Yazılımcı");
        Calisan muh = new Calisan("İnşaat Müh.");
        
        ekip3.calisanAdd(tasarimci);

        ekip2.calisanAdd(grafiker);
        ekip2.calisanAdd(yazilimci);
        ekip2.calisanAdd(ekip3);

        ekip1.calisanAdd(tasarimci);
        ekip1.calisanAdd(grafiker);
        ekip1.calisanAdd(yazilimci);
        ekip1.calisanAdd(muh);
        ekip1.calisanAdd(ekip2);

        yonetici.calisanAdd(ekip1);
        yonetici.calisanAdd(ekip2);
        yonetici.calisanAdd(ekip3);

        yonetici.bilgiGoster();
        System.err.println("---------------");
        ekip1.bilgiGoster();
        System.err.println("---------------");
        ekip2.bilgiGoster();
        System.err.println("---------------");
        ekip3.bilgiGoster();
    }
}
