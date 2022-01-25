public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ProductCatalog items = new ProductCatalog("Ürünler");

        ProductCatalog phones = new ProductCatalog("Telefonlar");

        ProductCatalog iPhone = new ProductCatalog("iPhone Telefonlar");
        ProductCatalog samsung = new ProductCatalog("Samsung Telefonlar");

        Product iphone5Item = new Product("iPhone 5 Telefon");
        Product samsungGalaxyItem = new Product("Samsung Galaxy Telefon");

        ProductCatalog motorola = new ProductCatalog("Motorola Telefonlar");
        Product zen4 = new Product("Motorola Zen 4");
        Product iPhone11ProMax = new Product("IPhonee 11 Pro Max");
        // En üst hiyerarşiye telefon düğümü ekleniyor.
        items.add(phones);

        // Telefon hiyerarşisine Samsung ve iPhone düğümleri ekleniyor.
        phones.add(iPhone);
        phones.add(samsung);
        
        // iPhone hiyerarşisine iPhone5 yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
        iPhone.add(iphone5Item);
        
        // Samsung hiyerarşisine Samsung Galaxy yaprağı (En alt yapıdır, içerisinde bir düğüm içermez) ekleniyor.
        samsung.add(samsungGalaxyItem);
        
        items.Ciz();
        System.out.println("--------------------------");
        phones.add(motorola);
        motorola.add(zen4);
        iPhone.add(iPhone11ProMax);
        items.Ciz();

        //             -Ürünler
        //             --Telefonlar
        //             ---iPhone Telefonlar
        //             ----iPhone 5 Telefon
        //             --Samsung Telefonlar
        //             ---Samsung Galaxy Telefon
    }
}
