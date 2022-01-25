public class App {
    public static void main(String[] args) throws Exception {
        InsanKaynaklari ekip1=new InsanKaynaklari();
        InsanKaynaklari ekip2=new InsanKaynaklari();
        InsanKaynaklari ekip3=new InsanKaynaklari();
        InsanKaynaklari ekip4=new InsanKaynaklari();
        InsanKaynaklari ekip5=new InsanKaynaklari();
        
        Tasarimci tasarimci=new Tasarimci();
        Yonetici yonetici=new Yonetici();
        Gelistirici gelistirici=new Gelistirici();
        
        ekip1.CalisanEkle(yonetici);
        ekip1.CalisanEkle(ekip2);
        
        ekip2.CalisanEkle(yonetici);
        ekip2.CalisanEkle(ekip3);
        ekip2.CalisanEkle(yonetici);
        ekip2.CalisanEkle(yonetici);
        ekip2.CalisanEkle(ekip4);
        
        ekip3.CalisanEkle(gelistirici);
        
        ekip4.CalisanEkle(gelistirici);
        ekip4.CalisanEkle(tasarimci);
        ekip4.CalisanEkle(ekip5);
        
        ekip5.CalisanEkle(gelistirici);
        
        System.out.println("----Ekip1---- ");
        ekip1.bilgiGoster();
        System.out.println();

        System.out.println("----Ekip2---- ");
        ekip2.bilgiGoster();
        System.out.println();

        System.out.println("----Ekip3---- ");
        ekip3.bilgiGoster();
        System.out.println();
        
        System.out.println("----Ekip4---- ");
        ekip4.bilgiGoster();       
        System.out.println();
        
        System.out.println("----Ekip5---- ");
        ekip5.bilgiGoster();
        System.out.println();

    }
}
