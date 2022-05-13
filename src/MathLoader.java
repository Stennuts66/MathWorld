import mathWorld.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MathLoader {
    static ArrayList<String> mathsDescriptions = new ArrayList<>();
    static void addMathsToList() {
        mathsDescriptions.add(DegreeOrRadian.getDesc());
        mathsDescriptions.add(PrimeCalculator.getDesc());
    }
    static void printChoices() {
        mathsDescriptions.forEach((mathDesc) -> System.out.println(mathsDescriptions.indexOf(mathDesc) + ". | " + mathDesc));
    }
    static int chooseMathMethod() {
        Scanner scanner;
        do {
            System.out.println("-----\nWould you like to solve a Math problem? Write a number from 0 to 10. 10 to exit.");
            scanner = new Scanner(System.in);
        } while (!scanner.hasNextInt());
        return scanner.nextInt();
    }
    static void selectMath(int mathMethodNumber){
        if (mathMethodNumber == 0) {
            DegreeOrRadian.transformDegreeOrRadian();
        } else if (mathMethodNumber == 1){
            PrimeCalculator.calculatePrimes();
        }
    }
    public static void doMath() {
        addMathsToList();
        int mathMethodNumber;
        do {
            System.out.println("---------------------------\n---Welcome to Math World---\n---------------------------");
            printChoices();
            mathMethodNumber = chooseMathMethod();
            if (mathMethodNumber == 10) {
                break;
            } else {
                selectMath(mathMethodNumber);
            }
        } while (10 != mathMethodNumber);
    }
}