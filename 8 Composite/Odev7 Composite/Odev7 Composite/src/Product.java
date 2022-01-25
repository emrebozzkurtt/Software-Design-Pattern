public class Product implements CatalogService{
    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public void Ciz() {
        System.out.println(" -- " + name);
    }
    
}
