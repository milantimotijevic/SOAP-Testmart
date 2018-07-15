package app;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import model.Product;

@WebService(name="TestMartCatalog", targetNamespace="http://www.testmart.com")
public interface ProductCatalogInterface {

    @WebMethod
    public abstract boolean addProduct(String category, String product);

    @WebMethod
    public abstract List<String> getProductCategories();

    @WebMethod
    public abstract List<String> getProducts(String category);

    @WebMethod
    @WebResult(name = "Product")
    public abstract List<Product> getProductsv2(String category);

    @WebMethod
    public abstract boolean removeProduct(String category, String product);
    
}
