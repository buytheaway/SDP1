interface Product {
    double getDiscount();
}

class FoodProduct implements Product {
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.1;  
    }
}


class ElectronicsProduct implements Product {
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.05;
    }
}


class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();  // Polymorphism
    }
}

class ClothingProduct implements Product {
    public double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price * 0.15;
    }
}

public class Main {
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        Product food = new FoodProduct(100.0);
        Product electronics = new ElectronicsProduct(200.0);
        Product clothing = new ClothingProduct(150.0);

        System.out.println("Food discount: $" + discountCalculator.calculateDiscount(food));
        System.out.println("Electronics discount: $" + discountCalculator.calculateDiscount(electronics));
        System.out.println("Clothing discount: $" + discountCalculator.calculateDiscount(clothing));
    }
}
