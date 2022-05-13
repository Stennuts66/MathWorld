package mathWorld;

import java.util.Scanner;

public class PrimeCalculator {
    static String desc = "Prime number checker";
    static String longDesc = """
            Java program 2 figure out if user input is a prime number or not. Prime numbers are A prime number is a whole number greater than 1 whose only factors are 1 and itself.
             A factor is a whole number that can be divided evenly into another number.
            """;
    public static String getDesc() {
        return desc;
    }
    public static void calculatePrimes() {
        System.out.println(longDesc + "\nPlease input your number to check for Prime.");
        int inputNumber = getInput();
        if(isPrime(inputNumber))
            System.out.println(inputNumber + " is Prime.");
            else {
            System.out.println((inputNumber + " is not Prime. Sorry!"));
        }
    }
    static boolean isPrime(int inputNumber) {
        if (inputNumber > 1) {
            //todo
            return inputNumber % 2 == 1;
        }
        return false;
    }
    static int getInput() {
        Scanner scanner;
        do {
            scanner = new Scanner(System.in);
        } while (!scanner.hasNextInt());
        return scanner.nextInt();
    }
}