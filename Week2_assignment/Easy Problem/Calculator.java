/*Simple Calculator (if-else) Write a Java program that asks the user to enter two numbers and an operator (+, -, *, /) and
 then calculates the result based on the operator using if-else statements. */


public class Calculator {

   public int add(int a, int b){
    return a + b;
   }
   public int subtract(int a, int b){
    return a - b;
   }
   public int product(int a, int b){
    return a * b;
   }
   public double quotient(int a, int b){
    if (b>0) {
        return a / b;  
    }
   else
   {
    System.out.println("the second value must be greater than zero");
   }
    return b;
   }
public static void main(String[] args) {
          Calculator calc = new Calculator();
          int a = 10;
          int b = 5;
          int c = calc.add(a, b);
          System.out.println(c);
}
    
}
    

