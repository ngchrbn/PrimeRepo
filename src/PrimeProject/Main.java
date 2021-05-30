package PrimeProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int number = input.nextInt();

        isPrime(number);
    }

    private static void isPrime(int number) {
        boolean flag = number <= 1;

        // loop from 2 to half the number because
        // a number is not divisible by more than its half
        for(int i=2; i<number/2; ++i)
        {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
        {
            System.out.println(number + " is a prime number");
        }
        else
        {
            System.out.println(number + " is not a prime number");
        }
    }
}
