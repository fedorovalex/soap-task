package model.localstorage;

import java.util.HashMap;
import java.util.Map;
import model.SalePoint;

public class SalePointLocal {

    private static final SalePointLocal salePointTest = new SalePointLocal();
    private final Map<String, SalePoint> salePoints;

    private SalePointLocal() {

        salePoints = new HashMap<>();
        salePoints.put("ali", new SalePoint(0, "aliexpress", "ru.aliexpress.com"));
        salePoints.put("ozon", new SalePoint(1, "ozon", "www.ozon.ru"));
        salePoints.put("ulmart", new SalePoint(2, "ulmart", "www.ulmart.ru"));
    }

    public static SalePointLocal get() {
        return salePointTest;
    }

    public Map<String, SalePoint> getSalePoints() {
        return salePoints;
    }

}
