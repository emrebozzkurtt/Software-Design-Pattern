import java.util.ArrayList;
import java.util.List;

public class ProductCatalog implements CatalogService {

    private String cName;
    private List<CatalogService> list;

    public ProductCatalog(String cName) {
        this.cName = cName;
        list = new ArrayList<CatalogService>();
    }

    public void add(CatalogService catalogService) {
        list.add(catalogService);
    }

    @Override
    public void Ciz() {
        System.out.println(cName);
        for (CatalogService catalog : list) {
            catalog.Ciz();
        }

    }

}
