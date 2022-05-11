package mathWorld;

import java.util.Scanner;

import static java.lang.Math.PI;

public class DegreeOrRadian {
    static String desc = "Degree 2 Radian or Radian 2 Degree converter.";
    static String longDesc = """
            Java program 2 convert Degrees to Radians or Radians to Degrees. The Radian is the standard unit of angular measure, used in many areas of mathematics.
            An angle's measurement in radians is numerically equal to the length of a corresponding arc of a unit circle.
            """;
    public static String getDesc() {
        return desc;
    }
    public static void transformDegreeOrRadian() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(longDesc + "\nWould you like to convert Degrees to Radians or Radians to Degrees? Choose 0 or 1:");
        int conversionMethod = scanner.nextInt();
        switch (conversionMethod) {
            case 0 -> System.out.println(transformDegreeToRadian(conversionMethod));
            case 1 -> System.out.println(transformRadianToDegree(conversionMethod));
        }
    }
    static String transformRadianToDegree(int conversionMethod) {
        return concatenateResult(setInitialDegrees(conversionMethod) * (180/PI));
    }
    static String transformDegreeToRadian(int conversionMethod) {
        return concatenateResult(setInitialDegrees(conversionMethod) * (PI/180));
    }
    static double setInitialDegrees(int conversionMethod) {
        Scanner scanner = new Scanner(System.in);
        if (conversionMethod == 0) {
            System.out.println("Converting Degrees to Radians. Input degrees from 0 to 360");
            return scanner.nextDouble();
        }
        System.out.println("Converting Radians into Degrees. Input Radians from 0 to 6.2835");
        return scanner.nextDouble();
    }
    static String concatenateResult(double transformedResult) {
        return String.format("%.3f", transformedResult);
    }
}