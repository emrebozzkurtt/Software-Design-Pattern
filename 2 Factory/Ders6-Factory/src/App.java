public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n----Factory----\n");
        String dosya = "Dektop/folder";
        
        //*****Yeni Bir paremetre eklenmesi sonucu hata verir
        //** Fakat Factory ile oluşturulanlar hata vermez çünkü Class lara bağımlı değildir
 
 /*
        //Factory Olmadan
        Zip zip = new Zip(".zip");
        zip.compString(dosya);

        //Rar rar = new Rar("RAR/");
        //rar.compString(dosya);
*/

        Factory factory = new Factory();

System.out.println("\n1.Yöntem");

        factory.dosyaService("rar").compString(dosya);
        factory.dosyaService("zip").compString(dosya);

System.out.println("\n2.Yöntem");

        factory.rarGetir().compString(dosya);
        factory.zipGetir().compString(dosya);
    
System.out.println("\n3.Yöntem");

        Rar rar2 = (Rar) factory.rarGetir();
        rar2.compString(dosya);
        Zip zip2 = (Zip) factory.dosyaService("zip");
        zip2.compString(dosya);
    }
}
