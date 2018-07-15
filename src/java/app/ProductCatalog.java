package app;

import business.ProductServiceImpl;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import model.Product;

@WebService(endpointInterface = "app.ProductCatalogInterface", portName="TestMartCatalogPort", serviceName="TestMartCatalogService") //portName and serviceName HAVE to be inside the implementation (won't get applied from interface)
public class ProductCatalog implements ProductCatalogInterface {

    ProductServiceImpl productService = new ProductServiceImpl();


    public List<String> getProductCategories() {
        return productService.getProductCategories();
    }

    public List<String> getProducts(String category) {
        return productService.getProducts(category);
    }

    public boolean addProduct(String category, String product) {
        return productService.addProduct(category, product);
    }

    public boolean removeProduct(String category, String product) {
        return productService.removeProduct(category, product);
    }

    public List<Product> getProductsv2(String category) {
        return productService.getProductsv2(category);
    }
}
