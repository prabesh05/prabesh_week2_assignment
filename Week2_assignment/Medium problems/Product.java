/*Product Discount Calculator Create a class Product with productName, price, and discountPercentage. Write a method calculateFinalPrice() which returns price
 after discount. Create 3 different products and print their final prices. */

 
public class Product {
    public String productName;
    public float price;
    public float discount;

    public Product(String ProductName,float price,float discount) {
        this.productName = ProductName;
        this.price= price;
        this.discount = discount;
    }
    public void calculateFinalPrice() {
        float finalPrice = price - (discount / 100) * price;
        System.out.println("Final price of " + productName + ": " + finalPrice);
    }
    public static void main(String[] args) {
        Product sneakers = new Product("Air Jordan",50000,15);
        Product jackets = new Product("Jacket",3000,12.5f);
        Product  airpods = new Product("Airpods Gen2",40000,10);

        sneakers.calculateFinalPrice();
        jackets.calculateFinalPrice();
        airpods.calculateFinalPrice();

    }
}
