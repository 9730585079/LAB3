// Assignment3_OnlineMarketplace.java

// Interface Sellable
interface Sellable {
    void displayItemDetails();
    double getPrice();
}

// Abstract class Product
abstract class Product {
    protected String name;
    protected String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public abstract double calculateDiscount();
}

// Concrete class ElectronicItem
class ElectronicItem extends Product implements Sellable {
    private double basePrice;

    public ElectronicItem(String name, String category, double basePrice) {
        super(name, category);
        this.basePrice = basePrice;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + String.format("%.2f", basePrice));
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public double calculateDiscount() {
        return basePrice * 0.10; // 10% discount for electronics
    }
}

// Concrete class ClothingItem
class ClothingItem extends Product implements Sellable {
    private double basePrice;

    public ClothingItem(String name, String category, double basePrice) {
        super(name, category);
        this.basePrice = basePrice;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + String.format("%.2f", basePrice));
    }

    @Override
    public double getPrice() {
        return basePrice;
    }

    @Override
    public double calculateDiscount() {
        return basePrice * 0.05; // 5% discount for clothing
    }
}

// Main class to demonstrate Assignment 3
public class OnlineMarketplace {
    public static void main(String[] args) {
        ElectronicItem laptop = new ElectronicItem("Laptop", "Electronics", 50000);
        laptop.displayItemDetails();
        double discountedPriceLaptop = laptop.getPrice() - laptop.calculateDiscount();
        System.out.println("Discounted Price: " + String.format("%.2f", discountedPriceLaptop));
        System.out.println();

        ClothingItem shirt = new ClothingItem("T-Shirt", "Apparel", 1200);
        shirt.displayItemDetails();
        double discountedPriceShirt = shirt.getPrice() - shirt.calculateDiscount();
        System.out.println("Discounted Price: " + String.format("%.2f", discountedPriceShirt));
    }
}
