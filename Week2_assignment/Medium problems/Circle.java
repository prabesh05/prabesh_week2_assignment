/*Constants Usage Example Create a Circle class with an attribute radius. Use a final constant PI = 3.14159. Write a method calculateCircumference() and calculateArea() using PI. 
Create two Circle objects and display their area and circumference. */



public class Circle {
    public float radius;
    
    public Circle(float radius) {
        this.radius= radius;
    }
    public static void main(String[] args) {
        final float PI = 3.14159f;
       
        Circle circle = new Circle(44.3f);
        float Area= PI* circle.radius* circle.radius;

        System.out.println("The area is:"+Area);
        



    }
    
}
