/*Create Multiple Objects Create a class Car with attributes brand and year. 
Create two Car objects in the main method and display their details. */

public class Car {
public String brand;
public int year;

public Car(String brand, int year) {
    this.brand = brand;
    this.year = year;
}
void displayDetails() {
    System.out.println("Brand"+brand);
    System.out.println("Year:"+year);
}
public static void main(String[] args){
    Car c1 = new Car("Porsche",2008);
    Car c2 = new Car("Lamborghini",2005);
    
    c1.displayDetails();
    c2.displayDetails();
}
    
}
