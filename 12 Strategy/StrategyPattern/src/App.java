public class App {
    public static void main(String[] args) throws Exception {
        Strategy yibasi = new Yilbasi();
        Strategy haftasonu = new Haftasonu();
        Strategy normal = new Normal();

        yibasi.arayüzSec();
        System.out.println("Fiyat: "+ yibasi.fiyatHesapla(1500) + "\n");
        

        haftasonu.arayüzSec();
        System.out.println("Fiyat: " + haftasonu.fiyatHesapla(1500) + "\n");
        
        normal.arayüzSec();
        System.out.println("Fiyat: " + normal.fiyatHesapla(1500) + "\n");
    }
}
