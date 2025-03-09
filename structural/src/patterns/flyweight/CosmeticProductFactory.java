package patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CosmeticProductFactory {
    private Map<String, CosmeticProduct> productMap = new HashMap<>();

    public CosmeticProduct getCosmeticProduct(String productType, String brand) {
        String key = productType + "-" + brand;

        if (!productMap.containsKey(key)) {
            productMap.put(key, new ConcreteCosmeticProduct(productType, brand));
            System.out.println("Creating new product of type: " + productType + " and brand: " + brand);
        }
        return productMap.get(key);
    }

    public int getProductCount() {
        return productMap.size();
    }
}
