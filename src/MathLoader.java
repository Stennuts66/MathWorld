import mathWorld.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MathLoader {
    static ArrayList<String> mathsDescriptions = new ArrayList<>();
    public static void getMath() {
        addMathsToList();
        printMathChoices();
        int mathMethodNumber = chooseMath();
        doMath(mathMethodNumber);
    }
    static void addMathsToList() {
        mathsDescriptions.add(DegreeOrRadian.getDesc());
    }
    public static void printMathChoices() {
        mathsDescriptions.forEach((mathDesc) -> System.out.println(mathDesc.indexOf(mathDesc) + " | " + mathDesc));
    }
    public static int chooseMath() {
        System.out.println("\nChoose your math tool:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static void doMath(int mathMethodNumber) {
        if (mathMethodNumber == 0) {
            DegreeOrRadian.transformDegreeOrRadian();
        }
    }
}