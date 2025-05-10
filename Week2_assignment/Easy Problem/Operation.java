/*Simple arithmetic operations Write a Java program that declares two integers and prints their sum, difference, product, and quotient. */


public class Operation {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 6;
        int add = num1+num2;
        int subtract = num1-num2;
        int multiply = num1*num2;
        float division = (float)num1/num2;
        
        System.out.println("Addition:"+add);
        System.out.println("Subtraction:"+subtract);
        System.out.println("Multiplication:"+multiply);
        System.out.println("Division:"+division);
    }
}
