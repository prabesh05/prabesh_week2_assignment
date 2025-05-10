/*Positive, Negative or Zero Write a Java program that takes a number and prints whether the number is positive, negative, or zero. */


public class NumberChecker {
    public static void main(String [] args) {
        int num = -3;
        if(num>0) {
            System.out.println("Positive number");

        }
        else if (num<0) {
            System.out.println("Negative number");
        }
    else {
        System.out.println("The number is 0");
    }

    
}
}