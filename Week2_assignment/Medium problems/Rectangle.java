/*Rectangle and Area Calculation Create a class Rectangle with length and width. Initialize using a constructor. Create a method calculateArea()
 that returns the area. Create 3 rectangles of different dimensions and display their areas. */


public class Rectangle {
   public float length;
   public float breadth;
   
   public Rectangle(float l, float b) {
    this.length = l;
    this.breadth = b;
 
   }
   public float calculateArea() {
    return length*breadth;
   }
   public static void main(String[] args) {
    Rectangle rec1 = new Rectangle(15,30);
    Rectangle rec2 = new Rectangle(30,22);
    Rectangle rec3 = new Rectangle(15.5f,22.4f);
   
    rec1.calculateArea();
    rec2.calculateArea();
    rec3.calculateArea();

    System.out.println("Area:"+rec1.calculateArea());
    System.out.println("Area:"+rec2.calculateArea());
    System.out.println("Area:"+rec3.calculateArea());
   }
   
    
}
