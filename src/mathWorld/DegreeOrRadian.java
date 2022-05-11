package mathWorld;

import java.util.Scanner;

import static java.lang.Math.PI;

public class DegreeOrRadian {
    static String desc = "Degree 2 Radian or Radian 2 Degree converter.";
    static String longDesc = """
            Java program to convert Degrees to Radians or Radians to Degrees. The Radian is the standard unit of angular measure, used in many areas of mathematics.
            An angle's measurement in radians is numerically equal to the length of a corresponding arc of a unit circle.
            """;
    public static String getDesc() {
        return desc;
    }
    static double setInitialDegrees(int mathMethod) {
        Scanner scanner = new Scanner(System.in);
        if (mathMethod == 0) {
            System.out.println("Converting Degrees to Radians. Input degrees from 0 to 360");
            return scanner.nextDouble();
        }
        System.out.println("Converting Radians into Degrees. Input Radians from 0 to 6.2835");
        return scanner.nextDouble();
    }
    static String transformRadianToDegree(int mathMethod) {
        return concatenateResult(setInitialDegrees(mathMethod) * (180/PI));
    }
    static String transformDegreeToRadian(int mathMethod) {
        return concatenateResult(setInitialDegrees(mathMethod) * (PI/180));
    }
    static String concatenateResult(double transformedResult) {
        return String.format("%.3f", transformedResult);
    }
    public static void transformDegreeOrRadian() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(longDesc + "\nWould you like to convert Degrees to Radians or Radians to Degrees? Choose 0 or 1:");
        int mathMethod = scanner.nextInt();
        switch (mathMethod) {
            case 0 -> System.out.println(transformDegreeToRadian(mathMethod));
            case 1 -> System.out.println(transformRadianToDegree(mathMethod));
        }
    }
}