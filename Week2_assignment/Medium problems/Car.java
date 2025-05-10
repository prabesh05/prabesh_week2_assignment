/*Manual Car Showroom Inventory Create a Car class with attributes: brand, model, price. 
Create 5 different Car objects with different details. Display the cars whose price is greater than 20,00,000 (use if statement). */

public class Car {
    public String brand;
    public String model;
    public int price;
    
    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
public void displayCarDetails() {
    if (price>2000000) { 
    System.out.println("Brand:"+brand);
    System.out.println("Model:"+model);
    System.out.println("Price:"+price);
}
    
}
public static void main(String[] args) {
    Car  car1= new Car("Porsche","911 Carerra S",100000000);
    Car car2 = new Car ("Lamborghini","Sian",100000);
    Car car3= new Car("Mercedes","G-Wagon",500000000);

    car1.displayCarDetails();
     car2.displayCarDetails();
     car3.displayCarDetails();
}
}