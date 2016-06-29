package exercise18_01;

import java.util.Scanner;
import java.math.*;

public class Exercise18_01 {
    
    /** Return the factorial for the specified number */
    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));
        
        return result;
    }

    public static void main(String[] args) {

        /** Get input from user */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        /** Print factorial */
        System.out.println("Factorial of " + n + " is " + factorial(n));

    }

}