package patterns.flyweight;

public class ConcreteCosmeticProduct implements CosmeticProduct {
    private String productType;
    private String brand;

    public  ConcreteCosmeticProduct(String productType, String brand) {
        this.productType = productType;
        this.brand = brand;
    }

    @Override
    public void displayProductInformation(String uniqueColor) {
        System.out.println("Cosmetic Product Info:");
        System.out.println("Product Type: " + productType);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + uniqueColor);
    }
}
