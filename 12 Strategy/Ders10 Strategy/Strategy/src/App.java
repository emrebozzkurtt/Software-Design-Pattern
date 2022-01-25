public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();

        Standart standart = new Standart();
        Duzen yibasi = new Yilbasi();
        Duzen haftasonu = new Haftasonu();

        Magaza magaza = new Magaza();
        magaza.setDuzen(standart);
        magaza.FiyatHesapla(standart.getFiyat());
        magaza.TasarimiGoster(standart.getTasarim());
    
        magaza.setDuzen(yibasi);
        magaza.FiyatHesapla(10*0.8);
        magaza.TasarimiGoster("Yibasi");
    }
}
