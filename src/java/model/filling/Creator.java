package model.filling;


import java.text.SimpleDateFormat;
import java.util.Map;
import model.Product;
import model.Report;
import model.SalePoint;
import model.localstorage.ProductLocal;
import model.localstorage.SalePointLocal;

public class Creator {

    private final Map<String, SalePoint> salePoints = SalePointLocal.get().getSalePoints();
    private final Map<String, Product> products = ProductLocal.get().getProducts();
    private final DateAdapter dateAdapter = new DateAdapter(new SimpleDateFormat("yyyy-MM-dd"));

    public Report createReport(String product, String salePoint, String date, int amount) {

        return new Report(
                products.get(product),
                salePoints.get(salePoint),
                dateAdapter.toDateFormat(date),
                amount
        );
    }
}
