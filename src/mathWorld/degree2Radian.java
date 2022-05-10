package mathWorld;

import static java.lang.Math.PI;

public class degree2Radian {
    static String desc = """
            Java program to convert degree to radian. The radian is the standard unit of angular measure, 'used in many areas of mathematics.
            An angle's measurement in radians is numerically equal to the length of a corresponding arc of a unit circle.
            """;
    static double initialDegrees = 15;
    static double calculate2Radian() {
        return initialDegrees * (PI/180);
    }
    static String concatenatedRadians() {
        return String.format("%.5f", calculate2Radian());
    }
    static String degree2RadianSolution = (desc + "\nTo convert: " + initialDegrees + " degrees" +
            " | Converted to: " + concatenatedRadians() + " radians.");

    public static String getDegree2Radian() {
        return degree2RadianSolution;
    }
}