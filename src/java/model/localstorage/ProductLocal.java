package model.localstorage;

import java.util.HashMap;
import java.util.Map;
import model.Product;

public class ProductLocal {

    private static final ProductLocal productTest = new ProductLocal();
    private final Map<String, Product> products;

    private ProductLocal() {

        products = new HashMap<>();
        products.put("cube", new Product(0, "DaYan 5 ZhanChi"));
        products.put("pyramid", new Product(1, "MoFangGe X-man Bell Pyraminx"));
        products.put("skewb", new Product(2, "DaYan Skewb"));

    }

    public static ProductLocal get() {
        return productTest;
    }

    public Map<String, Product> getProducts() {
        return products;
    }

}
